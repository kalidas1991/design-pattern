package com.app.creational;

public class SingletonMethodSynchronized {

	private static SingletonMethodSynchronized instance;

	private SingletonMethodSynchronized() {
	}

	public static synchronized SingletonMethodSynchronized getInstance() {
		if (instance == null) {
			instance = new SingletonMethodSynchronized();
		}
		return instance;
	}
}
