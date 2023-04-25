package models;


import Interfaces.Swimmable;

public class Swimmer implements Swimmable {

    private String name;

    public Swimmer(String name){
        this.name = name;
    }


    @Override
    public String swim(int distance) {
        return this.name + " swam " + distance + "m";
    }
}
