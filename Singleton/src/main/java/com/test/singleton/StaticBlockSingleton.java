package com.test.singleton;

public class StaticBlockSingleton {

	private static StaticBlockSingleton simpleSingleton = null;
	static {
		simpleSingleton = new StaticBlockSingleton();
	}

	private StaticBlockSingleton() {
		super();
	}

	public static StaticBlockSingleton getInstance() {
		return simpleSingleton;
	}

}
