package jp.ne.naokiur.design.pattern.bridge.after;

public abstract class Humanble {
    protected String gendar;

    public String cry() {
        return gendar + " Crying!!";
    }

    public String talk() {
        return gendar + " Talk!!";
    }

    public String getGendar() {
        return gendar;
    }

    public void setGendar(String gendar) {
        this.gendar = gendar;
    }
}
