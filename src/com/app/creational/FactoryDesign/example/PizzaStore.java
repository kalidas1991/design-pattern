package com.app.creational.FactoryDesign.example;

public class PizzaStore {

    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory){
        this.simplePizzaFactory = simplePizzaFactory;
    }

    Pizza orderPizza(String type){

        Pizza pizza = simplePizzaFactory.createPizza(type);
        try {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }catch (NullPointerException e){
            e.printStackTrace();
        }

        return pizza;

    }
}
