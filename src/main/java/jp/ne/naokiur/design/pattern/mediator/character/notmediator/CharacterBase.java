package jp.ne.naokiur.design.pattern.mediator.character.notmediator;

import jp.ne.naokiur.design.pattern.mediator.Position;
import jp.ne.naokiur.design.pattern.mediator.Status;

public abstract class CharacterBase implements Character {
    private Position position;
    private Status status;

    public CharacterBase() {
        this.position = Position.FRONT;
        this.status = Status.ALIVE;
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
        switch (this.getPosition()) {
        case FRONT:
            this.setPosition(Position.BEYOND);

            break;

        case BEYOND:
            this.setPosition(Position.FRONT);

            break;

        default:
            break;
        }
    }

}
