package models;

import Interfaces.Cyclable;
import Interfaces.IRun;
import Interfaces.Swimmable;

import java.util.ArrayList;
import java.util.List;

public class Championship {

    private String name;

    //has to be list not an array list, since it has to include the interface as a collection/interface
    // not tying ourselves to one implementation - lists are more applicable and can allow implementation of any type of list (ArrayList, LinkedList..)
    // loose coupling rather than tight
    // using Cyclist rather than Cyclable in our list would work but make it tight coupling
    private List<Cyclable> cyclists;
    private List<IRun> runners;
    private List<Swimmable> swimmers;


    public Championship(String name){
        //initialise them
        this.name = name;
        this.swimmers = new ArrayList<>();
        this.cyclists = new ArrayList<>();
        this.runners = new ArrayList<>();
        // can implement ArrayList here because we declared it as a List in the declaration above
        // can't implement List here because it's abstract and is implementing an interface
    }


    //method
    public void addSwimmer(Swimmable swimmer){
        this.swimmers.add(swimmer);
    }

    public void addRunner(IRun runner){
        this.runners.add(runner);
    }

    public void addCyclist(Cyclable cyclist){
        this.cyclists.add(cyclist);
    }



    // getters
    public List<Swimmable> getSwimmers() {
        return this.swimmers;
    }

    public List<IRun> getRunners() {
        return this.runners;
    }

    public List<Cyclable> getCyclists() {
        return this.cyclists;
    }
}
