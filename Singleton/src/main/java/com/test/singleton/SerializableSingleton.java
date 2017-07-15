package com.test.singleton;

public class SerializableSingleton {
	private static SerializableSingleton simpleSingleton = null;

	private SerializableSingleton() {
		super();
	}

	public static SerializableSingleton getInstance() {
		if (simpleSingleton == null) {
			simpleSingleton = new SerializableSingleton();
		}
		return simpleSingleton;
	}

	private void writeExternal() throws Exception {
		throw new Exception("Unsuppoted operaion.");
	}

	private void readExternal() throws Exception {
		throw new Exception("Unsuppoted operaion.");
	}
}
