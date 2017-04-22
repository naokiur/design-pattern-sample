package jp.ne.naokiur.design.pattern.command;

public class Drawing extends Command {
    private Canvas canvas;
    private int thickness;
    private String color;
    private String type;

    public Drawing(int thickness, String color, String type) {
        this.thickness = thickness;
        this.color = color;
        this.type = type;
    }

    @Override
    public void execute(Canvas canvas) {
        canvas.addArt(thickness + " " + color + " " + type);
        this.canvas = canvas;
    }

    @Override
    public void undo() {
        String current = canvas.getField();
        canvas.setField(current.replace(thickness + " " + color + " " + type, ""));
    }

    @Override
    public void redo() {
        execute(this.canvas);
    }
}
