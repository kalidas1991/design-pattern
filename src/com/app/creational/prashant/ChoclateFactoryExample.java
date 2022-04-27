package com.app.creational.prashant;

public class ChoclateFactoryExample {

    /**
     * Everyone knows that all modern chocolate factories have computer-controlled chocolate boilers.
     * The job of the boiler is to take in chocolate and milk, bring them to a boil, and then pass them on to the next phase of making chocolate bars.
     */

    //Design a chocolate boiler such that it has only one boiler instance and performs draining the boiler,boiling,filling activities carefully

    private boolean empty;
    private boolean boiled;
    public static ChoclateFactoryExample choclateFactoryExample;

    private ChoclateFactoryExample(){
        empty=true;
        boiled=false;
    }

    public static ChoclateFactoryExample getInstance(){
        //Lazy instantiation
        if(choclateFactoryExample==null){
            choclateFactoryExample= new ChoclateFactoryExample();
        }
        return choclateFactoryExample;
    }

    //to fill the boiler check if its currently filled or not. Can't fill a filled boiler!
    public boolean fill(){
        if(isEmpty()){
            empty=false;
            boiled=false;
            return true;
        }
        return false;
    }
    //to boil we must check if its not empty. Can't boil a empty boiler!
    public boolean boil(){
        if(!isEmpty()&&!isBoiled()){
            boiled=true;
            return true;
        }
        return false;
    }
    //To drain the boiler, the boiler must be filled and boiled once
    public boolean drain(){
        if(!isEmpty()&&isBoiled()){
            empty=true;
            boiled=false;
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        return empty;
    }
    public boolean isBoiled(){
        return boiled;
    }


}
