package com.tikal.hangout.guava.collections;

import static com.google.common.collect.HashBasedTable.create;

import com.google.common.collect.Table;
import static java.lang.Boolean.*;
public class TableSample {

	public static void main(String[] args) {
		Table<Integer, Integer, Boolean> table = create();
		table.put(1, 1, TRUE);
		table.put(2, 1, FALSE);
		table.put(2, 2, FALSE);
		table.put(1, 2, FALSE);
		System.out.println(table.get(2, 1));
		System.out.println(table.row(1));
		System.out.println(table.rowKeySet());
	}
}
