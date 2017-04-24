package jp.ne.naokiur.design.pattern.memento;

public class Canvas {
    private String painting ;

    public Canvas() {
        this.painting = "";
    }

    public void paint(String value) {
        this.painting = this.painting + value;
    }

    public String getPainting() {
        return painting;
    }

    public void setPainting(String painting) {
        this.painting = painting;
    }
}
