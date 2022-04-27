package com.app.creational.prashant;

public class SingletonLazy {
    //object to store the instance of the class
    public static SingletonLazy singletonLazy;

    //declared constructor as private
    private SingletonLazy(){

    }
    public static SingletonLazy getInstance(){

        //Lazy instantiation
        if(singletonLazy==null){
            singletonLazy = new SingletonLazy();
        }
        //if object already exist return the pre-existing object
        return singletonLazy;
    }
}
