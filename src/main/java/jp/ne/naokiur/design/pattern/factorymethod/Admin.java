package jp.ne.naokiur.design.pattern.factorymethod;

public class Admin implements Authority {

    @Override
    public String createInformation(String target) {
        return "Admin : " + target;
    }

}
