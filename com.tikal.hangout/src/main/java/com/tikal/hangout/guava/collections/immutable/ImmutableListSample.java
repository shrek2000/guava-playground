package com.tikal.hangout.guava.collections.immutable;

import static com.google.common.collect.ImmutableList.of;
import static java.util.stream.Collectors.joining;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
public class ImmutableListSample {
	
	public static void main(String[] args) {
			ImmutableList<Integer> immutableList = of(46,56,32,22,1,345);
			String result = immutableList.stream().sorted().map(i -> i.toString()).collect(joining(","));
			System.out.println(result);
		
			try {
				immutableList.iterator().remove();
			} catch (Exception e) {
				System.out.println("Cannot be deleted, it is immutable!!!");
			}
	}
}
