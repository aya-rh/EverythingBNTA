public abstract class Bird extends Animal {

    public Bird(String name){
        super(name);
        // super calls constructor from parent class
        // still needs to be there
    }

    public String layEgg(){
        return "I've laid an egg!";
    }

    public String fly(){
        return "Look at me, I'm flying!";
    }

}
