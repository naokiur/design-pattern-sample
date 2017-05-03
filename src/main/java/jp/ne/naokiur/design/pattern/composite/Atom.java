package jp.ne.naokiur.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Atom {
    private String elementSynbol;

    protected List<Atom> bonds;

    public Atom(String elementSynbol) {
        this.bonds = new ArrayList<Atom>();
        this.elementSynbol = elementSynbol;
    }

    public String getElementSynbol() {
        return elementSynbol;
    }

    public String createChemicalFormula() {
        String result = this.elementSynbol;
        for (Atom atom : bonds) {
            result = result + atom.createChemicalFormula();
        }


        return result;
    }
}
