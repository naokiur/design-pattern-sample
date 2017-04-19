package jp.ne.naokiur.design.pattern.state;

public class App {

    public static void main(String[] args) {
        SpilitCard card = new SpilitCard(State.NORMAL, 30, "Magician");

        // battle begin
        card.spentTurn();
        card.changeStatus(State.POISON);
        card.spentTurn();
        card.spentTurn();
        card.spentTurn();
        // battle end
    }
}
