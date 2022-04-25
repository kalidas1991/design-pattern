package com.app.creational;

public class SingletonBlockSynchronized {
	private static SingletonBlockSynchronized instance;

	private SingletonBlockSynchronized() {
	}

	public static SingletonBlockSynchronized getInstance() {
		if (instance == null) {
			synchronized (SingletonBlockSynchronized.class) {
				if (instance == null) {
					instance = new SingletonBlockSynchronized();
				}
			}
		}
		return instance;
	}

}
