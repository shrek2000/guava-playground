package com.tikal.hangout.guava.collections;

import static com.google.common.collect.FluentIterable.from;
import static com.google.common.collect.ImmutableList.of;
import static java.util.stream.Collectors.joining;

import com.google.common.collect.ImmutableList;
public class FluentIterableSample {
	
	public static void main(String[] args) {
		ImmutableList<String> cities = of("Tel Aviv", "Jerusalem","New Yourk", "Paris","Bagdad");
		String result = from(cities).filter(city -> city.contains("e")).transform(city -> "'"+city + "'").limit(2).toString();
		System.out.println("FluentIterable result: " + result);
		result = cities.stream().filter(city -> city.contains("e")).map( city ->"'"+city+"'").limit(2).collect(joining(" "));
		System.out.println("Java 8 result: " + result);
	}
}
