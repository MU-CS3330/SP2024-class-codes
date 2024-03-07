package edu.mu.generics.customADT;

import java.util.ArrayList;

public class CustomMap <K,V> {
	
	private ArrayList<Pair<K,V>> map;
	
	public CustomMap() {
		map = new ArrayList<Pair<K,V>>();
	}

	public void printKeyList() {
		for(Pair pair : map) {
			System.out.println("Key: " + pair.getKey());
		}
	}
	
	public void printValueList() {
		for(Pair pair : map) {
			System.out.println("Value: " + pair.getValue());
		}
	}
	
	public void printKeyValueList() {
		for(Pair pair : map) {
			System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
		}
	}
	
	
	public boolean addKeyValue(K key, V value) {
		Pair<K,V> pairData = new Pair<>(key, value);
		return map.add(pairData);
	}
	
}
