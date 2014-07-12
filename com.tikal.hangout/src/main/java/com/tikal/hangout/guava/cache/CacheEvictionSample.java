package com.tikal.hangout.guava.cache;

import java.util.concurrent.TimeUnit;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.Weigher;

public class CacheEvictionSample {
	public static void main(String[] args) {
		Cache<Integer, String> cache = CacheBuilder.newBuilder()
				.maximumSize(1000)
				.initialCapacity(100)
				.expireAfterAccess(100, TimeUnit.SECONDS)
				.expireAfterWrite(1500, TimeUnit.DAYS)
				.maximumWeight(10000)
				.weigher( new Weigher<Integer, String>() {

					@Override
					public int weigh(Integer i, String s) {
						return i *s.length();
					}
				})
				.build();
	}
}
