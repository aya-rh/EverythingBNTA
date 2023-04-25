public class Tiger extends Animal {

    public Tiger(String name){
        super (name);
    }

    //Tiger now has to make a noise since we declared makeNoise as an abstract method
    // we have to implement it here and dont have to include the @override

    public String makeNoise(){
        return "MEOW!";
    }


    public String makeNoise(String message){
        return "In my opinion, " + message + ".";
    }


}
