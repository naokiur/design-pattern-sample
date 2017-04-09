package jp.ne.naokiur.design.pattern.factorymethod;

public class Normal implements Authority {

    @Override
    public String createInformation(String target) {

        return "Normal : " + target;
    }
}
