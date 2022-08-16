package chapter14.chain;

public class FanHandler implements HandlerChain {
    private HandlerChain next;

    @Override
    public void setNext(HandlerChain handlerChain) {
        next = handlerChain;
    }

    @Override
    public void handleRequest(Email email) {
        if (email.getContent().contains("감사")) {
            System.out.println("팬 메일입니다. CEO에게 전달합니다.");
        } else {
            if (next != null) {
                next.handleRequest(email);
            }
        }
    }

}
