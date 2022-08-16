package chapter14.chain;

public class MailFilter {
    private final HandlerChain chain;

    public MailFilter() {
        HandlerChain spamChain = new SpamHandler();
        HandlerChain fanChain = new FanHandler();
        HandlerChain complaintChain = new ComplaintHandler();
        HandlerChain newLocChain = new NewLocHandler();

        spamChain.setNext(fanChain);
        fanChain.setNext(complaintChain);
        complaintChain.setNext(newLocChain);

        chain = spamChain;
    }

    public void filtering(Email email) {
        chain.handleRequest(email);
    }

}
