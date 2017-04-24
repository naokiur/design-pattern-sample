package jp.ne.naokiur.design.pattern.memento;

public class App {

    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.paint("test");
        System.out.println(canvas.getPainting());

        canvas.paint("hoge");
        System.out.println(canvas.getPainting());
    }
}
