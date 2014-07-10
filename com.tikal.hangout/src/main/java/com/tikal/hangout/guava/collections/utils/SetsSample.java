package com.tikal.hangout.guava.collections.utils;

import static com.google.common.collect.Sets.difference;
import static com.google.common.collect.Sets.newHashSet;
import static com.google.common.collect.Sets.union;
import static java.util.stream.Collectors.joining;

import java.util.Set;
import java.util.function.Function;

public class SetsSample {
	public static void main(String[] args) {
		Function<Integer,String> toString = t -> t.toString();
		Set<Integer> set1 = newHashSet(4,5,6,8,9);
		Set<Integer> set2 = newHashSet(5,6,8);
		System.out.println("Difference ="+	difference(set1, set2).stream().sorted().map(toString).collect(joining(",")));
		System.out.println("Union ="+	union(set1, set2).stream().sorted().map(toString).collect(joining(",")));
		
	}
}
