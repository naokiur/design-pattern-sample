package jp.ne.naokiur.design.pattern.templatemethod;

public class Passenger {
    private Card card;

    public Passenger(Card card) {
        this.card = card;
    }

    public String touchGate() {
        return card.touchGate();
    }

    public void changeCard(Card card) {
        this.card = card;
    }
}
