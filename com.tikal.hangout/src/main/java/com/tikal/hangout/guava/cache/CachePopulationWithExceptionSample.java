package com.tikal.hangout.guava.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class CachePopulationWithExceptionSample {
	private static final CacheLoader<Integer,String> cacheLoaderFunction = new CacheLoader<Integer,String>() {
		@Override	public String load(Integer key) {
			return "Value";
		}

	};
public static void main(String[] args) {
	LoadingCache<Integer, String> cache = CacheBuilder.newBuilder()
		       .maximumSize(1000)
		       .build(cacheLoaderFunction );
		try {
		  String value = cache.getUnchecked(1);
		  System.out.println("Value in cache of 1 is "+value);
		  value = cache.getIfPresent(2);
		  System.out.println("Value in cache of 2 is "+value);
		} catch (Exception e) {
		  System.out.println("Failed to read cache "+e.getMessage());
		}
}
}
