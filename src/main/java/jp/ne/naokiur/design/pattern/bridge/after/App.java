package jp.ne.naokiur.design.pattern.bridge.after;

public class App {

    public static void main(String[] args) {
        Male male = new Male(new Baby());
        Female female = new Female(new Baby());

        System.out.println(male.cry());
        System.out.println(female.cry());

        Male maleLittleChild = new Male(new LittleChild());
        Female femaleLittleChild = new Female(new LittleChild());

        System.out.println(maleLittleChild.talk());
        System.out.println(femaleLittleChild.talk());
    }
}
