public class LogicalOperators {
    // Logical operators:
    // && - are both true?
    // || - are either true?

    public static void main(String[] args) {
        boolean labhandedIn = true;
        boolean studentPresent = false;

        if (labhandedIn && studentPresent) {
            System.out.println("Happy Trainers!");
        }
        else {
            System.out.println("Sad Trainers!");
        }


        // Logical or - ||
        boolean hasTraining = true;
        boolean hasExperience = false;

        if (hasTraining || hasExperience) {
            System.out.println("You're Hired!");
        }
        else {
            System.out.println("You're Fired!");
        }


        // Look into switch statements later - used in case of using a lot of if else's. to simplify.
    }
}
