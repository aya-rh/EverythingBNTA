import Documents.Email;
import Documents.IDocument;
import Print.LaserPrinter;
import Print.PrintManager;

public class Main {
    public static void main(String[] args) {
        PrintManager printManager = new PrintManager(new LaserPrinter());
        // don't do this  - printer = new LaserPrinter();
        // new LaserPrinter up internally so that it isn't declared twice - bad practice

        IDocument doc = new Email("Check out ChatGPT", "The robot overlords are coming!", "crazy@sensational.com");

        printManager.print(doc);
        // used to print instead of 'sout' because it's done internally, we souted in LaserPrinter and InkJetPrinter
        // won't print sender though because we're printing from LaserPrinter, and it doesn't include that

    }


}
