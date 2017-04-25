package jp.ne.naokiur.design.pattern.memento;

import java.util.LinkedHashMap;
import java.util.Map;

public class CanvasVersionManagement {
    private Map<Integer, CanvasMementable> versions;

    public CanvasVersionManagement() {
        this.versions = new LinkedHashMap<>();
    }

    public Map<Integer, CanvasMementable> getVersions() {
        return versions;
    }

    public void add(Integer number, CanvasMementable memento) {
        this.versions.put(number, memento);
    }
}
