package com.app.creational.prashant;

public class SingletonBlockSynchronized {

    //volatile - ensures that the same value is shared across multiple threads.
    // avoids cache incoherence problem. The value is updated in all the threads, as soon as it's changed.
    private static volatile SingletonBlockSynchronized singletonBlockSynchronized;

    private SingletonBlockSynchronized(){

    }
// This design used to remove the additional overhead caused by making the whole method synchronized.
// here only the inner block is syncronized making it lighter than method syncronization.
    public static SingletonBlockSynchronized getInstance(){
        if(singletonBlockSynchronized==null){
            synchronized (SingletonMethodSynchronized.class){
                if(singletonBlockSynchronized==null){
                    singletonBlockSynchronized = new SingletonBlockSynchronized();
                }
            }
        }
        return singletonBlockSynchronized;
    }
}
