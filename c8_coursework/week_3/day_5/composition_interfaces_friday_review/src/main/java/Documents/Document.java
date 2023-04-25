package Documents;

public class Document implements IDocument {

   private String title;
   private String body;

   // needs constructor as it's a class
    // without public keyword - will default package use, public allows us to use it beyond that
    public Document(String title, String body) {
        this.title = title;
        this.body = body;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitles(String Title) {
        this.title = title;
    }

    @Override
    public String getBody() {
        return body;
    }

    @Override
    public void setBody(String body) {
        this.body = body;
    }
}
