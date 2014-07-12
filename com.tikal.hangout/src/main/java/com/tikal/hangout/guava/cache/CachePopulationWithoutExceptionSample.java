package com.tikal.hangout.guava.cache;

import java.util.concurrent.ExecutionException;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

public class CachePopulationWithoutExceptionSample {
	

	public static void main(String[] args) {
		Cache<Integer, String> cache = CacheBuilder.newBuilder()
				.maximumSize(1000).build();

		String value;
		try {
			value = cache.get(1, () -> "Value");
			System.out.println("Value of 1 in cache is " + value);
			cache.put(2, "Some Value");
			System.out.println("Value of 2 in cache is " + cache.getIfPresent(2));
		} catch (ExecutionException e) {
			System.out.println("Failed to get cache " + e.getMessage());
		}
	

	}
}
