package chapter14.chain;

public class NewLocHandler implements HandlerChain {
    private HandlerChain next;

    @Override
    public void setNext(HandlerChain handlerChain) {
        next = handlerChain;
    }

    @Override
    public void handleRequest(Email email) {
        if (email.getSubject().contains("설치") || email.getContent().contains("설치")) {
            System.out.println("신규 설치 요청 메일입니다. 영업부로 전달합니다.");
        } else {
            if (next != null) {
                next.handleRequest(email);
            }
        }
    }

}
