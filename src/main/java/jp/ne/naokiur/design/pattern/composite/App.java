package jp.ne.naokiur.design.pattern.composite;

public class App {

    public static void main(String[] args) {
        Carbon carbon = new Carbon();
        carbon.bond(new Hydrogen());
        carbon.bond(new Hydrogen());
        carbon.bond(new Hydrogen());

        Carbon basicCarbon = new Carbon();
        basicCarbon.bond(new Hydrogen());
        basicCarbon.bond(new Hydrogen());
        basicCarbon.bond(new Hydrogen());
        basicCarbon.bond(carbon);

        System.out.println(basicCarbon.createChemicalFormula());
    }
}
