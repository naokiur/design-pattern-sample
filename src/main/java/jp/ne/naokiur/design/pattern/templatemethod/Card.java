package jp.ne.naokiur.design.pattern.templatemethod;

public abstract class Card {
    protected abstract String pickCardName();
    public String touchGate() {
        String cardName = pickCardName();
        return cardName + "を使って、改札を通りました。";
    }
}
