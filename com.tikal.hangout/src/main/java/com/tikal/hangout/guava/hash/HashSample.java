package com.tikal.hangout.guava.hash;

import static com.google.common.collect.ImmutableList.of;
import static com.tikal.hangout.guava.hash.User.createUser;
import static java.util.stream.Collectors.joining;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

public class HashSample {
	public static void main(String[] args) {
	
		ImmutableList<User> users = of(createUser("James", "Bond", 34),
				createUser("Shimon", "Peres", 93),
				createUser("John", "Doe", 18));
		ImmutableList<HashFunction> hashes = of(Hashing.adler32(),
				Hashing.md5(), Hashing.murmur3_128());
		for (HashFunction hf : hashes) {
			String result = users
					.stream()
					.map(user -> user.toString() + ". hash is :" + hf.newHasher()
							.putString(user.getLastName(), Charsets.UTF_16)
							.hash().toString())
							.collect(joining(" , "));
			System.out.println(" Hash Results " + result);
		}

	}

}
