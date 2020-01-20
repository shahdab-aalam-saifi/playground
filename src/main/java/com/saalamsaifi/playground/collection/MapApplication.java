package com.saalamsaifi.playground.collection;

public class MapApplication {
	public static void main(String[] args) {
		MapStore store = new MapStore();
		
		store.add("first_name", "Shahdab Aalam");
		store.add("middle_name", "Mohamed Ahamad");
		store.add("last_name", "Saifi");
		
		System.out.println(store.get("first_name"));
		System.out.println(store.get("middle name"));
		System.out.println(store.get("last"));
		System.out.println(store.get("name"));
		
		store.print();
	}
}
