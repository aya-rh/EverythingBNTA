import java.util.Scanner;

public class ScannerAndExceptions {
    private static Scanner reader;
    // have to declare it here*

    // static means it belongs to class, there is a static method below
    // instance means that it belongs to the objects created within the class
    public static void main(String[] args) {
        // local variable of type SCANNER

        // System.in - to use the inputStream or we can create a file and pass that instead
        // have to declare it in the class otherwise would only be accessible within the main method *

//        reader = new Scanner(System.in);

        // could either make the 'reader' static
        // or create a constructor and declare it there

//        var app = new ScannerAndExceptions();  // don't need because we made the Scanner static
//        app.reader.hasNext();

        reader = new Scanner(System.in);
//        int input = reader.nextInt(); // can take other data types - nextInt, nextBoolean etc
//        System.out.println(input);

        // comment two above lines out to use the while loop below
        // can use while loop to ensure that there is no crash when the wrong data type is given as input
            //prompt user for input
            //store in variable and assess
        boolean loop = true;
        int secret = 5;
        System.out.println("Guess a number between 1 and 10!");

        while(loop){
            try{
                int num = reader.nextInt();
                System.out.println();
                if(secret == num){
                    System.out.println("Well done, you guessed it!");
                    loop = false;
                    //if you dont include this if loop, will be an infinite loop
                } else if (secret > num) {
                    System.out.println("Nope, try a higher number");
                }
                else {
                    System.out.println("Try a lower number");
                }
            }
            catch (Exception e){
                System.out.println("Sorry can you provide a valid numerical value?");
                continue; // need this on anything other than .nextLine (String)
//                continue;
            }
        }
    }

    // could comment out everything below this line and will still work
    // produces an echo program - give input, and it will give it back to you

    ScannerAndExceptions(){
        reader = new Scanner(System.in);
    }

    public Scanner getReader(){
        return this.reader;
    }


}
