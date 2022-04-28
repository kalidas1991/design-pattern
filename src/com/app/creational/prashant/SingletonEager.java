package com.app.creational.prashant;

public class SingletonEager {

    //Eager initialisation of instance, even though it's not needed
    private static SingletonEager singletonEager = new SingletonEager();

    private SingletonEager(){

    }
    public static SingletonEager getInstance(){
        return singletonEager;
    }

}
