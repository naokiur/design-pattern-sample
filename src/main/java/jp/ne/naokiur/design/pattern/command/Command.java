package jp.ne.naokiur.design.pattern.command;

public abstract class Command {
    public abstract void execute(Canvas canvas);
    public abstract void undo();
    public abstract void redo();
}
