package com.tikal.hangout.guava.collections.forwarding;

import java.util.*;

import com.google.common.collect.*;
import com.tikal.hangout.guava.util.*;
/**
 * http://stackoverflow.com/questions/3502066/guava-forwardinglist-usage-example
 */
public class ListForwardingSample {
	public static class ListWithDefault<E> extends ForwardingList<E> {
		final E defaultValue;
		final List<E> delegate;

		ListWithDefault(List<E> delegate, E defaultValue) {
			this.delegate = delegate;
			this.defaultValue = defaultValue;
		}

		@Override
		protected List<E> delegate() {
			return delegate;
		}

		@Override
		public E get(int index) {
			E v = super.get(index);
			return (v == null ? defaultValue : v);
		}

		@Override
		public Iterator<E> iterator() {
			final Iterator<E> iter = super.iterator();
			return new ForwardingIterator<E>() {
				@Override
				protected Iterator<E> delegate() {
					return iter;
				}

				@Override
				public E next() {
					E v = super.next();
					return (v == null ? defaultValue : v);
				}
			};
		}
	}

	public static void main(String[] args) {
		List<String> names = new ListWithDefault<>(Arrays.asList("Alice", null, "Bob", "Carol", null), "UNKNOWN");
		SystemOutConsumer systemOut = new SystemOutConsumer();
		names.stream().forEach(systemOut);
		System.out.println(names);
	}
}
