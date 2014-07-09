package com.tikal.hangout.guava.collections;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import static com.google.common.collect.Multisets.*;

public class MultiSetSample {
	public static final String okButton = "OK";
	public static final String cancelButton = "Cancel";

	public static void main(String[] args) {
		Multiset<String> clickCounter = HashMultiset.create();
		clickCounter.add(okButton);
		clickCounter.add(okButton);
		clickCounter.add(okButton);
		clickCounter.add(cancelButton, 5);
		System.out.println("Ok was click " + clickCounter.count(okButton)
				+ " times");
		System.out.println("cancelButton was click "
				+ clickCounter.count(cancelButton) + " times");
	}
}
