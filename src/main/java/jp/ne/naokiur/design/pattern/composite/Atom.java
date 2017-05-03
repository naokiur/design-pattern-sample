package jp.ne.naokiur.design.pattern.composite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
//        String result = this.elementSynbol;
        Map<String, Integer> elementCount = new HashMap<>();
        elementCount.put(this.elementSynbol, 1);

        for (Atom atom : bonds) {
            Map<String, Integer> bondElementCount = atom.countElement();

            for (Map.Entry<String, Integer> entry : bondElementCount.entrySet()) {
                if (elementCount.containsKey(entry.getKey())) {
                    Integer count = elementCount.get(entry.getKey()) + entry.getValue();
                    elementCount.put(entry.getKey(), count);
                } else {
                    elementCount.put(entry.getKey(), 1);

                }
            }
        }

        String result = "";
        for (Map.Entry<String, Integer> element : elementCount.entrySet()) {
            result = result + element.getKey() + element.getValue();
        }

        return result;
    }

    private Map<String, Integer> countElement() {
        Map<String, Integer> elementCount = new HashMap<>();
        elementCount.put(this.elementSynbol, 1);
        for (Atom atom : bonds) {
            if (elementCount.containsKey(atom.getElementSynbol())) {
                Integer count = elementCount.get(atom.getElementSynbol()) + 1;
                elementCount.put(atom.getElementSynbol(), count);
            } else {
                elementCount.put(atom.getElementSynbol(), 1);

            }
        }

        return elementCount;
    }
}
