package com.app.creational.prashant;

public class SingletonMethodSynchronized {
    private static  SingletonMethodSynchronized singletonMethodSynchronized;

    private SingletonMethodSynchronized(){

    }

    //synchronized here.. adds additional method overhead of synchronizing the method to make it thread safe.
    // this helps in case when two threads try to get the instance simultaneously
    private static synchronized SingletonMethodSynchronized getInstance(){

        if(singletonMethodSynchronized==null){
            singletonMethodSynchronized= new SingletonMethodSynchronized();
        }
        return singletonMethodSynchronized;
    }
}
