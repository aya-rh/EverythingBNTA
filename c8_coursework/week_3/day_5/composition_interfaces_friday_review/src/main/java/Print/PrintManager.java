package Print;

import Documents.IDocument;

public class PrintManager {
    private IPrinter printer;

    public PrintManager(IPrinter printer){
        this.printer = printer;
    }

    public void print (IDocument doc){
        printer.print(doc);
    }
}
