package jp.ne.naokiur.design.pattern.factorymethod;

public class User {
    private Authority authority;

    public User(Authority authority) {
        this.authority = authority;
    }

    public String createInfomation(String target) {
        return authority.createInformation(target);

    }

}
