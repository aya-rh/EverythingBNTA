import java.util.ArrayList;

public class Zoo {

    private ArrayList<Animal> animals;

    public Zoo(){
        this.animals = new ArrayList<>();
    }

    public int countAnimals(){
        return this.animals.size();
    }

    public void addAnimal (Animal animal){
        this.animals.add(animal);
    }

    // added on tuesday

    public int countBirdEggs(){
        int totalEggs = 0;
        for (int i = 0; i < this.animals.size(); i++){
            Bird bird = (Bird) animals.get(i);
            bird.layEgg();
            totalEggs += 1;
        }
        return totalEggs;
    }
    // get the ith thing out of Animal
    // putting (Bird) tells compiler treat it as bird, although it is an animal

    public void greetAnimals(){
        for(Animal animal : this.animals){
            System.out.println(animal.makeNoise());
        }
    }
}
