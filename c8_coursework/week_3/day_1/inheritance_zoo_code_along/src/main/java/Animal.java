public abstract class Animal {
    // adding abstract makes it so that you can't create 'new Animal'
    // can't create new animal constructor
    // deleted AnimalTest - don't need it anymore since we have extends classes

    // properties
    protected String name;
    private boolean healthy;


    // constructor
    public Animal(String name){
        this.name = name;
    }


    //methods

    //this method will be overridden in sub-classes
    // we can therefore just make it into an abstract method
//    public String makeNoise(){
//        return "Hello, my name is " + this.name + ".";
//    }

    public abstract String makeNoise();

    public String eat(){
        return "Mmmm, that was tasty!";
    }


    // getters setters

}
