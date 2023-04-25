public class RentACar {
    public static void main(String[] args) {

        int age = 23;
        boolean hasDriversLicense = true;
        int carsAvailable = 3;
        boolean hasDUI = false;
        boolean hasInternationalLicense = true;

        if(age > 21) {
            // nested if statements
            // ! = not
            if ((hasDriversLicense || hasInternationalLicense) && carsAvailable > 0 && !hasDUI) {
                // sub expression will equate to true or false
                System.out.println("Congrats, you're eligible to rent a car!");
            }
            else if (!hasDriversLicense || !hasInternationalLicense) {
                System.out.println("Sorry, no license, no car!");
            }
            else if (hasDUI) {
                System.out.println("No drink driving here!");
            }
            else if (carsAvailable < 1) {
                System.out.println("Sorry, all our cars are currently being rented");
            }
            else {
                System.out.println("Sorry, we can't give you a car and we have no good reason");
            }
        }
        else {
            System.out.println("Sorry. You're too you to rent a car from us.");
        }

    }
}
