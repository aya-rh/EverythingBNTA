import java.util.ArrayList;

public class Farmer {

    private String name;
    private int collectedEggs;

    public Farmer(String name){
        this.name = name;
        this.collectedEggs = 0;
    }

    public int getCollectedEggs(){
        return this.collectedEggs;
    }

    // METHOD
    public void collectEggs(Farm farm){
        // get chickens from the farm
        ArrayList<Chicken> chickens = farm.getChickens();

        // start a running total of found eggs
        int totalEggs = 0;

        // loop through chickens
        for (Chicken chicken : chickens){

            // add each chickens eggs to running total
            totalEggs += chicken.getEggs();
            chicken.setEggs(0);
        }
        // update collectedEggs with all eggs collected from chickens
        this.collectedEggs = totalEggs;


    }



}
