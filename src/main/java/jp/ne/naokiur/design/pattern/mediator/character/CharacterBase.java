package jp.ne.naokiur.design.pattern.mediator.character;

import jp.ne.naokiur.design.pattern.mediator.CrossRiver;
import jp.ne.naokiur.design.pattern.mediator.Position;
import jp.ne.naokiur.design.pattern.mediator.Status;

public abstract class CharacterBase implements Character {
    protected CrossRiver crossRiver;
    private Position position;
    private Status status;

    public CharacterBase() {
        this.position = Position.FRONT;
        this.status = Status.ALIVE;
    }

    @Override
    public void setMediator(CrossRiver crossRiver) {
        this.crossRiver = crossRiver;
    }

    @Override
    public Status getStatus() {
        return this.status;
    }

    @Override
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public void cross() {
        this.crossRiver.cross(this);
    }
}
