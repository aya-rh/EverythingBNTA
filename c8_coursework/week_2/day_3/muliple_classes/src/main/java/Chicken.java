public class Chicken {

//-----------first declare and set properties to private
    private String name;
    private int eggs;


//------------constructor - has to be public
    public Chicken(String name, int eggs){
        this.name = name;
        this.eggs = eggs;

    }

//-------------getters and setters--------
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    //another way to structure them -easier
    public int getEggs(){return this.eggs;}
    public void setEggs(int eggs) {this.eggs = eggs;}
}
