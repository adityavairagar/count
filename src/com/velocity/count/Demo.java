package com.velocity.count;

import java.util.HashMap;

public class Demo {

	public static void main(String[] args) {

		String str = "my my name is is lakhan lakhan ahe ahe";

		// lenght=str.length();
		String[] split = str.split(" ");
		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < split.length; i++) {
			if (map.containsKey(split[i])) {
				int count = map.get(split[i]);
				map.put(split[i], count + 1);
			} else {
				map.put(split[i], 1);
			}
		}
		System.out.println(map);
	}
}