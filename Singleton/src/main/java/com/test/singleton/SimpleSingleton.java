package com.test.singleton;

public class SimpleSingleton {

	private static SimpleSingleton simpleSingleton = null;

	private SimpleSingleton() {
		super();
	}

	public static SimpleSingleton getInstance() {
		if (simpleSingleton == null) {
			simpleSingleton = new SimpleSingleton();
		}
		return simpleSingleton;
	}

}
