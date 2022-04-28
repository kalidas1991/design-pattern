package com.app.creational.prashant;

public class Driver {

    /**
     * Singleton:There is power in ONE. Let’s say you have an object that contains registry settings.
     * You don’t want multiple copies of that object and its values running around—that would lead to chaos.
     * By using an object like me you can ensure that every object in your application is making use of the same global resource.
     *
     */
    public static void main(String[] args) {

        //should throw compiletime error
        //SingletonLazy singletonLazy = new SingletonLazy();
        //java: SingletonLazy() has private access in com.app.creational.prashant.SingletonLazy

        //check if same instance is returned
//        SingletonLazy singletonLazy= SingletonLazy.getInstance();
//        SingletonLazy anotherSingletonLazy= SingletonLazy.getInstance();
//
//        if(singletonLazy==anotherSingletonLazy){
//            System.out.println("same object");
//        }
//        else{
//            System.out.println("object differs");
//        }

        //Example
        ChoclateFactoryExample choclateFactoryExample= ChoclateFactoryExample.getInstance();

        //check if we can fill the boiler
        System.out.println(choclateFactoryExample.fill());
        System.out.println(choclateFactoryExample.boil());
        System.out.println(choclateFactoryExample.boil());
        System.out.println(choclateFactoryExample.drain());
        System.out.println(choclateFactoryExample.boil());
        System.out.println(choclateFactoryExample.fill());


    }
}
