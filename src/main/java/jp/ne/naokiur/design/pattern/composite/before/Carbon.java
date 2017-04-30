package jp.ne.naokiur.design.pattern.composite.before;

import java.util.ArrayList;
import java.util.List;

public class Carbon {
    private List<String> bonds;

    public Carbon() {
        this.bonds = new ArrayList<String>();
    }

    public List<String> getBonds() {
        return bonds;
    }

    public void bond(String atom) {
        bonds.add(atom);
    }
}
