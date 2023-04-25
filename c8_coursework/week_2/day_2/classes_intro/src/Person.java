public class Person {

    // person = new Person();
    // Error bc it doesn't know what type of variable it is

    // Person person = new Person();
    // Works because we've defined 'person' in the data type 'Person' then started it with new Person();



//   ----------CLASSES------------

    // Class defines the data type
    // Class can be used as its own data type

    // all classes must start with capital letter
    // class name must match name of file (Person class -> Person.java
    // classes open a curly bracket and define the properties and behaviours

    // umi: diagrams show the requirements of your code
    // class name: what an object is -> e.g. person
    // class properties: what an object has -> characteristics for every value in your class e.g. name and town
    // need to clarify data type so String name; and String town; (or Int temperature etc.)
    // class behaviours: what an object does aka methods -> name of method, data type and then return type ->
        //     greet(String): void
        //     generateBio(): String


    // ------------ Properties
    // define before the constructor

   private String name;
   private String town;
    private Integer age;
    private String favouriteColour;


    // --------- Constructor
    // created to determine what happens when using new key word
    // have to use 'public' keyword at start

    // Constructor e.g.
     public Person(String inputName, String inputTown, String inputFavouriteColour){
         this.name = inputName;
         this.town = inputTown;
         this.age = 0;
         this.favouriteColour = inputFavouriteColour;
         // if we don't do this step we won't be able to print it in main - System.out.println(person.name);
         // age starts at 0 because everyones age starts with 0 - will print 0 unless age defined
    }


    // ---------- Behaviours/Methods

    // method signature void greet ()
    // {} body
    // signature split into three parts: name -> "greet", return type -> "void", parameters -> "()"
    // void used to tell program that it won't be getting anything back, just going to use the method
    // we can leave method section empty - won't do anything, but we can
    void greet(){
        System.out.println("Hello!");
        System.out.println(156 * 56);
//        can add any instruction into the println brackets
//        method 'greet' can be called anything
    }

    // if wanting to use method more specifically - add object into brackets
    void greet(String timeOfDay){
        System.out.println("Good " + timeOfDay + "!");
    }

    String generateBio(){
         // could put void at start, but we wouldn't get anything back
        // in this instance we put String because we want words back, and we add return to get something back
        // this refers to specific object, so when person2 calls it, it will provide their information
        // lilac colour refers to class property
        return "My name is " + this.name + " and I live in " + this.town;
    }


//-------------Getters and Setters--------------
    public String getName(){
         return this.name;
    }
    public void setName(String name){
         this.name = name;
    }

//    PROPERTIES SHOULD BE PRIVATE - if we want access then we use getters and setters
//    METHODS SHOULD BE PUBLIC
}
