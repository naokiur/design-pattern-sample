package jp.ne.naokiur.design.pattern.bridge.before;

public abstract class Baby {
    protected String gendar;

    public String cry() {
        return gendar + " Crying!!";
    }
}
