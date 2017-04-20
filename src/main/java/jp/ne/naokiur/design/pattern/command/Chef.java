package jp.ne.naokiur.design.pattern.command;

import java.util.Deque;

public class Chef {
    private Deque<Command> undoStack;
    private Deque<Command> redoStack;

}
