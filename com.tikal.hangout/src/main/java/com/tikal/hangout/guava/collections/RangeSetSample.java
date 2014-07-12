package com.tikal.hangout.guava.collections;

import java.time.LocalDateTime;

import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;

public class RangeSetSample {
	public static void main(String[] args) {
		//set some times
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime tomorrow = LocalDateTime.now().plusDays(1);
		LocalDateTime yesterday = LocalDateTime.now().minusDays(1);
		LocalDateTime lastWeek = LocalDateTime.now().minusWeeks(1);
		LocalDateTime nextWeek = LocalDateTime.now().plusWeeks(1);
		RangeSet<LocalDateTime> timeRange = TreeRangeSet.create();
		timeRange.add(Range.closed(lastWeek, yesterday));
		timeRange.add(Range.closedOpen(tomorrow, nextWeek));
		System.out.println("Is today in range? "+timeRange.contains(now));
		System.out.println("Is two days ago in range? "+timeRange.contains(now.minusDays(2)));
		System.out.println("Is two days ahead in range? "+timeRange.contains(now.plusDays(2)));
		System.out.println("Is two weeks ahead in range? "+timeRange.contains(now.plusWeeks(2)));
		System.out.println("Is nextweek in range? "+timeRange.contains(nextWeek));

		System.out.println("Range is"+timeRange);

	}
}
