package jp.ne.naokiur.design.pattern.memento;

public class App {

    public static void main(String[] args) {
        CanvasVersionManagement management = new CanvasVersionManagement();
        Canvas canvas = new Canvas();

        canvas.paint("test");
        System.out.println(canvas.getPainting());
        management.add(1, canvas.createMemento());

        canvas.paint("hoge");
        System.out.println(canvas.getPainting());
        management.add(2, canvas.createMemento());

        canvas.revertMemento(management.getVersions().get(1));
        System.out.println(canvas.getPainting());

        canvas.revertMemento(management.getVersions().get(2));
        System.out.println(canvas.getPainting());

        canvas.paint("fuga");
        System.out.println(canvas.getPainting());
        management.add(3, canvas.createMemento());

        canvas.revertMemento(management.getVersions().get(1));
        System.out.println(canvas.getPainting());
    }
}
