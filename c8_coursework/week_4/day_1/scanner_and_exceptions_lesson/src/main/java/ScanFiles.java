import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//instead of using inputStream, like ScannerAndExceptions class, can input file
//method shown below in try catch block
public class ScanFiles {
    public static void main(String[] args) {
        try {
            File file = new File("src/main/java/input.txt"); // right click file, copy path/reference and paste the content root
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                System.out.println("There is another line!"); //not needed all the time
                String input = reader.nextLine();
                System.out.println(input);
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            // will tell you what went wrong
        }
    }

}
