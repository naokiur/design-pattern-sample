package jp.ne.naokiur.design.pattern.memento;

public class Canvas {
    private class CanvasMemento implements CanvasMementable {
        private String painting;

        public String getPainting() {
            return painting;
        }

        public void setPainting(String painting) {
            this.painting = painting;
        }
    }

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

    public CanvasMemento createMemento() {
        CanvasMemento memento = new CanvasMemento();
        memento.setPainting(this.painting);

        return memento;
    }

    public void revertMemento(CanvasMementable memento) {
        CanvasMemento canvasMemento = (CanvasMemento) memento;
        this.painting = canvasMemento.getPainting();
    }
}
