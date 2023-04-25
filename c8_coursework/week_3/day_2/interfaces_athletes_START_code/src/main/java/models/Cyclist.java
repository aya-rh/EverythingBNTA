package models;

import Interfaces.Cyclable;

public class Cyclist implements Cyclable {

    private String name;

    public Cyclist(String name){
        this.name = name;
    }



    //we have to override the method signature in the cyclable interface class
    // signature has to be the same as the one in the interface, can't change it
//    @Override
//    public String cycle(int distance){
//        //implementation
//    }
    // can just import methods from the squiggly line in the class


    @Override
    public String cycle(int distance) {
        return this.name + " cycled " + distance + "m";
    }


}
