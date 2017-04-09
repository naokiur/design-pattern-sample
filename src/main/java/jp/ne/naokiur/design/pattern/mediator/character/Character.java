package jp.ne.naokiur.design.pattern.mediator.character;

import jp.ne.naokiur.design.pattern.mediator.CrossRiver;
import jp.ne.naokiur.design.pattern.mediator.Position;
import jp.ne.naokiur.design.pattern.mediator.Status;

public interface Character {
    public void cross();

    public void setMediator(CrossRiver crossRiver);

    public Status getStatus();
    public void setStatus(Status status);
    public Position getPosition();
    public void setPosition(Position position);
}
