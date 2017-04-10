package jp.ne.naokiur.design.pattern.observer;

public class Jane extends Member {

    public Jane() {
        super("Jane Doe");
    }

    @Override
    public void takeHoliday() {
        System.out.println("I will go to shopping.");
        notifyManager();
    }

}
