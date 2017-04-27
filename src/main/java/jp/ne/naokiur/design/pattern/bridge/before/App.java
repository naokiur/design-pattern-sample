package jp.ne.naokiur.design.pattern.bridge.before;

public class App {

    public static void main(String[] args) {
        MaleBaby maleBaby = new MaleBaby();
        FemaleBaby femaleBaby = new FemaleBaby();

        System.out.println(maleBaby.cry());
        System.out.println(femaleBaby.cry());

        MaleLittleChild maleLittleChild = new MaleLittleChild();
        FemaleLittleChild femaleLittleChild = new FemaleLittleChild();

        System.out.println(maleLittleChild.talk());
        System.out.println(femaleLittleChild.talk());
    }
}
