package com.tikal.hangout.guava.util;
import java.util.function.Consumer;


public class SystemOutConsumer implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}

}
