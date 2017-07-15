package com.test.singleton;

public class ThreadsafeSingleton {
	private static ThreadsafeSingleton threadsafeSingleton = null;

	private ThreadsafeSingleton() {
		super();
	}

	// Approach One
	public static synchronized ThreadsafeSingleton getInstance1() {
		if (threadsafeSingleton == null) {
			threadsafeSingleton = new ThreadsafeSingleton();
		}
		return threadsafeSingleton;
	}

	// Approach Two
	public static ThreadsafeSingleton getInstance2() {
		if (threadsafeSingleton == null) {
			synchronized (ThreadsafeSingleton.class) {
				threadsafeSingleton = new ThreadsafeSingleton();
			}
		}
		return threadsafeSingleton;
	}
}
