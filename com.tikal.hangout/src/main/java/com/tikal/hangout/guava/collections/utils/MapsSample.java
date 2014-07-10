package com.tikal.hangout.guava.collections.utils;

import static com.google.common.collect.ImmutableMap.of;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.MapDifference;

import static com.google.common.collect.Maps.*;
public class MapsSample {
	public static void main(String[] args) {
		ImmutableMap<Integer,String> idToNameMap1 = of(34,"David",78,"Joe",4545,"Dan");
		ImmutableMap<Integer,String> idToNameMap2 = of(34,"David",78,"Joe",45435,"Mike");
		MapDifference<Integer, String> difference = difference(idToNameMap1, idToNameMap2);
		System.out.println("Common entries "+difference.entriesInCommon()); 
		System.out.println("Entries only on left "+difference.entriesOnlyOnLeft()); 
		System.out.println("Entries only on right "+difference.entriesOnlyOnRight()); 
	}
}
