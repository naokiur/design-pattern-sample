package jp.ne.naokiur.design.pattern.templatemethod;

public class Suica extends Card {

    @Override
    protected String pickCardName() {
        return "Suica";
    }
}
