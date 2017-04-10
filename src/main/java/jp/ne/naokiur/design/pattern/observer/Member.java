package jp.ne.naokiur.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Member {
    private List<Manager> managers;
    private final String name;

    public Member(String name) {
        this.managers = new ArrayList<>();
        this.name = name;
    }

    public void addManager(Manager manager) {
        managers.add(manager);
    }

    abstract public void takeHoliday();

    public void notifyManager() {
        for (Manager manager : managers) {
            manager.addAbsence(name);
        }
    }
}
