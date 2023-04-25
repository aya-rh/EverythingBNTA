package models;

import Interfaces.IRun;

public class Runner implements IRun {

    private String name;

    public Runner(String name){
        this.name = name;
    }


    @Override
    public String run(int distance) {
        return this.name + " ran " + distance + "m";
    }
}
