package chapter14.chain;

public class MailReceiver {
    public static void main(String[] args) {
        MailFilter filter = new MailFilter();

        Email spamMail = new Email("antop@google.com", "support@company.com",
                "[광고] 이벤트!", "");
        filter.filtering(spamMail);

        Email fanMail = new Email("fan@google.com", "support@company.com",
                "잘 사용하고 있습니다.", "감사합니다.");
        filter.filtering(fanMail);

        Email complaintMail = new Email("antop@naver.com", "support@company.com",
                "도저히 사용 못하겠습니다. 환불하주세요.", "정말 짜증나요!");
        filter.filtering(complaintMail);

        Email newLocMail = new Email("lee@naver.com", "support@company.com",
                "설치 요청합니다.", "우리 매장에 넣고 싶습니다.");
        filter.filtering(newLocMail);
    }
}
