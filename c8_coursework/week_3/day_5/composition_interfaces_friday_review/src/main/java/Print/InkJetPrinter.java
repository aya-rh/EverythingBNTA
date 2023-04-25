package Print;

import Documents.IDocument;

public class InkJetPrinter implements  IPrinter{

    @Override
    public void print(IDocument doc) {
        System.out.println("Ink jet Printer: ");
        if (doc != null){
            System.out.println("Title: " + doc.getTitle());
            System.out.println("Body: \n" + doc.getBody());
        }
       // don't have to do this just extra protection to ensure that what's being passed to printer has value
    }
}
