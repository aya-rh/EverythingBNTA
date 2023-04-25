package models;

import Interfaces.Cyclable;
import Interfaces.IRun;
import Interfaces.Swimmable;

// we will use a form of multiple inheritance by implementing multiple interfaces
public class Triathlete implements Cyclable, IRun, Swimmable {

    private String name;

    public Triathlete(String name){
        this.name = name;
    }

    @Override
    public String cycle(int distance) {
        // building string from constants and variables
        return this.name + " cycled " + distance + "m after swimming";
    }

    @Override
    public String run(int distance) {
        return this.name + " ran " + distance + "m after cycling";
    }

    @Override
    public String swim(int distance) {
        return this.name + " swam " + distance + "m from the start";
    }
}
