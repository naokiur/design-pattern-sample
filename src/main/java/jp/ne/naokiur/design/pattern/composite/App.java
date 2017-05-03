package jp.ne.naokiur.design.pattern.composite;

public class App {

    public static void main(String[] args) {
        Carbon firstCarbon = new Carbon();
        firstCarbon.bond(new Hydrogen());
        firstCarbon.bond(new Hydrogen());
        firstCarbon.bond(new Hydrogen());

        Carbon secondCarbon = new Carbon();
        secondCarbon.bond(new Hydrogen());
        secondCarbon.bond(new Hydrogen());
        secondCarbon.bond(new Hydrogen());
        secondCarbon.bond(firstCarbon);

        System.out.println(secondCarbon.createChemicalFormula());
    }
}
