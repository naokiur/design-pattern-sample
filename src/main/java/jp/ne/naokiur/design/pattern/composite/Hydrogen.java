package jp.ne.naokiur.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Hydrogen extends Atom {

    public Hydrogen() {
        super("H");
    }

    public List<Atom> getBonds() {
        return new ArrayList<>();
    }

}
