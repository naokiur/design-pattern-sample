package jp.ne.naokiur.design.pattern.mediator.character.notmediator;

import jp.ne.naokiur.design.pattern.mediator.Position;
import jp.ne.naokiur.design.pattern.mediator.Status;

public interface Character {
    public void cross();

    public Status getStatus();
    public void setStatus(Status status);
    public Position getPosition();
    public void setPosition(Position position);
}
