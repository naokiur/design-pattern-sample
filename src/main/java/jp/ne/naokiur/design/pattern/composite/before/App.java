package jp.ne.naokiur.design.pattern.composite.before;

public class App {

    public static void main(String[] args) {
        Carbon carbon = new Carbon();
        carbon.bond("Hydrogen");
        carbon.bond("Hydrogen");
        carbon.bond("Hydrogen");
        carbon.bond("Hydrogen");

        for (String atom : carbon.getBonds()) {
            System.out.println(atom);
        }
    }
}
