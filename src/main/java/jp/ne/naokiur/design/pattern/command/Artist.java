package jp.ne.naokiur.design.pattern.command;

import java.util.Deque;
import java.util.LinkedList;

public class Artist {
    private Deque<Command> undoStack = new LinkedList<>();
    private Deque<Command> redoStack = new LinkedList<>();

    public void write(Command command, Canvas canvas) {
        command.execute(canvas);
        undoStack.offerLast(command);
    }

    public void undoCanvas() {
        Command currentCommand = undoStack.pollLast();
        currentCommand.undo();
        redoStack.offerLast(currentCommand);
    }

    public void redoCanvas() {
        Command currentCommand = redoStack.pollLast();
        currentCommand.redo();
        undoStack.offerLast(currentCommand);
    }
}
