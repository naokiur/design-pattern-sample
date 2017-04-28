package jp.ne.naokiur.design.pattern.bridge.after;

public class Female {
    protected Humanble humanble;

    public Female(Humanble humanble) {
        this.humanble = humanble;
        humanble.setGendar("Female");
    }

    public String cry() {
        return humanble.cry();
    }

    public String talk() {
        return humanble.talk();
    }

}
