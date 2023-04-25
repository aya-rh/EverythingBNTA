public class Parrot extends Bird {

    public Parrot(String name){
        super (name);
    }

    @Override
    public String makeNoise(){
        return "SQUAWK!";
    }

    public String sayName(){
        return "My name is " + this.name + ".";
    }
    // 'this.name' returns error because name is private in Animal class
    // don't just switch it to public or remove public/private
    // middle ground, a key word 'protected'
    // means private but opened up a little
    // this will mean that name will be available anywhere within the inheritance chain - everything that extends Animal



}
