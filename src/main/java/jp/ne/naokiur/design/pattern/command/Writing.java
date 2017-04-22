package jp.ne.naokiur.design.pattern.command;

public class Writing extends Command {
    private Canvas canvas;
    private int thickness;
    private String color;
    private int length;

    public Writing(int thickness, String color, int length) {
        this.thickness = thickness;
        this.color = color;
        this.length = length;
    }

    @Override
    public void execute(Canvas canvas) {
        canvas.addArt(thickness + " " + color + " " + length);
        this.canvas = canvas;
    }

    @Override
    public void undo() {
        String current = canvas.getField();
        canvas.setField(current.replace(thickness + " " + color + " " + length, ""));
    }

    @Override
    public void redo() {
        execute(this.canvas);
    }
}
