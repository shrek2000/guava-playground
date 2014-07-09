package com.tikal.hangout.guava.immutable;

import com.google.common.collect.ImmutableMap;

import static com.google.common.collect.ImmutableMap.*;
public class ImmutableMapSample {

	public static void main(String[] args) {
		ImmutableMap<Integer,String> idToNameMap = of(34,"David",78,"Joe",4545,"Dan");
		idToNameMap.entrySet().stream().filter(e -> e.getKey() > 45).forEach(e -> System.out.println("key"+e.getKey()+ " value "+e.getValue()));
	
		try {
			idToNameMap.entrySet().iterator().remove();
		} catch (Exception e1) {
			System.out.println("Immutable cannot be deleted!!!");
		}
	}

}
