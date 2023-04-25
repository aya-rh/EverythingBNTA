package Documents;

public class Email implements IDocument {

    private String title;
    private String body;
    private String sender;

    public Email(String title, String body, String sender) {
        this.title = title;
        this.body = body;
        this.sender = sender;
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

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
