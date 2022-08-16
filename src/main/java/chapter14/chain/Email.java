package chapter14.chain;

public class Email {
    private final String sender;
    private final String receiver;
    private final String subject;
    private final String content;

    public Email(String sender, String receiver, String subject, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }
}
