package com.tikal.hangout.guava.collections;

import static com.google.common.collect.ImmutableBiMap.of;

import com.google.common.collect.BiMap;

public class BiMapSample {
	public static void main(String[] args) {
		BiMap<Integer, String> idToName = of(1, "David", 2, "Jack", 3, "Nick");
		String name = idToName.get(3);
		System.out.println("Name with id 3 = " + name);
		BiMap<String, Integer> nameToId = idToName.inverse();
		System.out.println("Id of " + name + " =" + nameToId.get(name));
	}
}
