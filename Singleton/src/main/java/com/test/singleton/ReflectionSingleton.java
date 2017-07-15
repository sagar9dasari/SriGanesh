package com.test.singleton;

public class ReflectionSingleton {
	private static ReflectionSingleton reflectionSingleton = null;

	private ReflectionSingleton() {
		super();
	}

	public static ReflectionSingleton getInstance() {
		if (reflectionSingleton == null) {
			reflectionSingleton = new ReflectionSingleton();
		}
		return reflectionSingleton;
	}

	public enum Singlton {

	}
}
