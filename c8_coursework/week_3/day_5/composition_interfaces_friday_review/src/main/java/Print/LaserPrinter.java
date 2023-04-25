package Print;

import Documents.IDocument;

public class LaserPrinter implements IPrinter {

    @Override
    public void print(IDocument doc) {
        System.out.println("Laser Printer: ");
        System.out.println("Title: " + doc.getTitle());
        System.out.println("Body: \n" + doc.getBody());
    }
}
