package jp.ne.naokiur.design.pattern.bridge.after;

public class Male extends Female {

    public Male(Humanble humanble) {
        super(humanble);
        humanble.setGendar("Male");
    }
}
