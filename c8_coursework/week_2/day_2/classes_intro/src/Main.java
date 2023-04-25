public class Main {
    public static void main(String[] args) {

        Person person = new Person("Aya", "Brighton", "Purple");
        Person person2 = new Person("Chinika", "High Wycombe", "Red");

//        System.out.println(person.name);
//        System.out.println(person2.name);
//        System.out.println(person.age);
//        System.out.println(person2.age);
//        System.out.println(person.favouriteColour);
//        System.out.println(person2.favouriteColour);


        person.greet();
//        person2.greet();
        // adding the () after is called 'calling' the method
        // greet assigns the method
        // now where on file does it say print Good morning but we have classified it in the person object class

        person.greet("afternoon");
        person2.greet("evening");

        // parameter:"argument"

        person.generateBio();
        // this won't print
        // have to add the String personBio because
        // then tell it to print

        String personBio = person.generateBio();
//        String person2Bio = person.generateBio();
        System.out.println(personBio);
        System.out.println(person2.generateBio().toUpperCase());

//      ---------Access Modifiers---------
//      you can access the name by printing this and then modify it
        // easy, however, this is not always good e.g. for private info
        System.out.println(person.getName());
        person.setName("Richard");
        System.out.println(person.getName());

        // to prevent this, we use access modifiers
        // we add private to each of our properties
        // will give you errors, but we have to add getters and setters, get in person file and add get infront of name

    }
}
