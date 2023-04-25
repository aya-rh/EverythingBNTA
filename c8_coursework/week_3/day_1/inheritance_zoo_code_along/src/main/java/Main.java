public class Main {

    public static void main(String[] args) {
        Lion lion = new Lion("Simba", false);
        Parrot parrot = new Parrot("Iago");
        Seagull seagull = new Seagull("Steve");
        Zoo zoo = new Zoo();
        zoo.addAnimal(lion);
        zoo.addAnimal(parrot);
        zoo.addAnimal(seagull);
        zoo.greetAnimals();
    }

}
