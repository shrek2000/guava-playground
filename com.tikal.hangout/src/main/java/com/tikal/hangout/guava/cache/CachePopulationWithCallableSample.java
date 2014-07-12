package com.tikal.hangout.guava.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class CachePopulationWithCallableSample {
	private static final CacheLoader<Integer, String> cacheLoaderFunction = new CacheLoader<Integer, String>() {
		@Override
		public String load(Integer key) {
			return "Value";
		}

	};

	public static void main(String[] args) {
		LoadingCache<Integer, String> cache = CacheBuilder.newBuilder()
				.maximumSize(1000).build(cacheLoaderFunction);

		String value = cache.getUnchecked(1);
		System.out.println("Value in cache is " + value);

	}
}
