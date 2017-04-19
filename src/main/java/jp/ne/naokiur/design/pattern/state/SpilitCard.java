package jp.ne.naokiur.design.pattern.state;

public class SpilitCard {
    private State status;
    private Integer hitPoint;
    private String name;

    public SpilitCard(State state, Integer hitPoint, String name) {
        super();
        this.status = state;
        this.hitPoint = hitPoint;
        this.name = name;
    }

    public void changeStatus(State state) {
        this.status = state;
    }

    public State getStatus() {
        return status;
    }

    public Integer getHitPoint() {
        return hitPoint;
    }

    public String getName() {
        return name;
    }

    public void spentTurn() {
        this.hitPoint = this.hitPoint - this.status.selectDamageAfterTurn();
        System.out.println(this.hitPoint);
    }
}
