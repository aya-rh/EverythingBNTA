import java.util.ArrayList;

public class Farm {

    // properties
    private String name;
    private int eggsForSale;
    private ArrayList<Chicken> chickens;


    //constructor
    // eggs for sale doesn't have to go in constructor because all farms will start with 0
    // if wanting all farms to start with specific number you would declare and include it
    public Farm(String name){
        this.name = name;
        this.eggsForSale = 0;
        this.chickens = new ArrayList<>();
    }

    //before adding and removing chicken you need to ensure that there are chickens there available
    // count chickens
    public int countChickens(){
        return this.chickens.size();
    }

    // now we can add and remove
    public void addChicken(Chicken chicken){
        this.chickens.add(chicken);
    }

    //different for remove
    public void removeChicken(){
        this.chickens.remove(0);
    }

    public ArrayList<Chicken> getChickens(){
        return this.chickens;
    }


//   can do this also:
//    public Chicken removeChicken(){
//        Chicken removedChicken = this.chickens.remove(0);
//        return removedChicken;
//    }
//
}
