package chapter14.chain;

public class SpamHandler implements HandlerChain {
    private HandlerChain next;

    @Override
    public void setNext(HandlerChain handlerChain) {
        next = handlerChain;
    }

    @Override
    public void handleRequest(Email email) {
        if (email.getSubject().startsWith("[광고]")) {
            System.out.println("스팸메일입니다. 삭제합니다.");
        } else {
            if (next != null) {
                next.handleRequest(email);
            }
        }
    }

}
