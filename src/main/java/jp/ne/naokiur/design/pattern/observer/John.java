package jp.ne.naokiur.design.pattern.observer;

public class John extends Member {

    public John() {
        super("John Smith");
    }

    @Override
    public void takeHoliday() {
        System.out.println("I will go to Park.");
        notifyManager();
    }
}
