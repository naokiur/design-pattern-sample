package jp.ne.naokiur.design.pattern.composite;

public class Carbon extends Atom {

    public Carbon() {
        super("C");
    }

    public void bond(Atom atom) {
        bonds.add(atom);
    }
}
