package com.tikal.hangout.guava.collections;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;

import static com.google.common.collect.Multimaps.*;
import static com.google.common.collect.Lists.*;
import static java.util.stream.Collectors.*;

import java.util.*;
public class MultiMapSample {
public static void main(String[] args) {
	// do not use this
	Map<String,List<String>> doNotDoThis = new HashMap<>();
	
	// use multimap!
	Multimap<String,String> basketballSample = ArrayListMultimap.create();
	String macabbi = "Macabbi Tel aviv";
	basketballSample.putAll(macabbi,newArrayList("Shawn James","Devin Smith","Alex Tyus","Guy Pnini"));
	basketballSample.putAll("New York Knicks",newArrayList("Cole Aldrich","Carmelo Anthony","Samuel Dalembert"));
	System.out.println(basketballSample.get(macabbi).stream().collect(joining(",")));
	
	// 
}

}
