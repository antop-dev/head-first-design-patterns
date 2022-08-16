package chapter14.chain;

public class ComplaintHandler implements HandlerChain {
    private HandlerChain next;

    @Override
    public void setNext(HandlerChain handlerChain) {
        next = handlerChain;
    }

    @Override
    public void handleRequest(Email email) {
        if (email.getSubject().contains("환불") || email.getContent().contains("환불")) {
            System.out.println("항의 메일입니다. 법무 담당 부서로 전달합니다.");
        } else {
            if (next != null) {
                next.handleRequest(email);
            }
        }
    }

}
