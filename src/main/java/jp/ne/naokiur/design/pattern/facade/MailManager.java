package jp.ne.naokiur.design.pattern.facade;

public class MailManager {
    public boolean sendToCustomer(String content) {
        System.out.println(content);

        return true;
    }
}
