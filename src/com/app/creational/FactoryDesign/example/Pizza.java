package com.app.creational.FactoryDesign.example;

public class Pizza {

    Pizza orderPizza(String type){

        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("greek")){
            pizza = new GreekPizza();
        }else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }

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

    public static void main(String[] args) {

    }

    private void bake() {
    }

    private void cut(){

    }

    private void box(){

    }

    private void prepare() {
    }
}
