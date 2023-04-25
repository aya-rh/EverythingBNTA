public class Lion extends Animal {
    // compiler error until you put constructor in
    // 'extends' links it to the Animal class

    private boolean canWaitToBeKing;

    // constructor
    // pass in properties of Animal class
    // will come up with errors
    // put 'super'
    // now everything an animal can do, a Lion can do too!
    public Lion(String name, boolean canWaitToBeKing){
        super (name);
        this.canWaitToBeKing = canWaitToBeKing;

        // add properties
        // has to have all the properties in Animal can have extra of own
    }

    @Override
    public String makeNoise(){
        // o with arrow on the side showing that its overriding something from a parent class
        // put @Override above
        // we can make do whatever we want as long as its returning a String

        return "ROAR!";

        //then have to change in test to avoid error
    }

}
