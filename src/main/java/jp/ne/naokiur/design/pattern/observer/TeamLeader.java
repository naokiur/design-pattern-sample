package jp.ne.naokiur.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader implements Manager {
    List<String> absenceNameList;

    public TeamLeader() {
        this.absenceNameList = new ArrayList<>();
    }

    @Override
    public void addAbsence(String name) {
        absenceNameList.add(name);

    }

    public String reportAbsences() {
        return String.join(", ", absenceNameList.toArray(new String[absenceNameList.size()]));
    }
}
