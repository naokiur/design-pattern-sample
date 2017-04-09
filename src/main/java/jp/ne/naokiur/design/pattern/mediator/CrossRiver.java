package jp.ne.naokiur.design.pattern.mediator;

import jp.ne.naokiur.design.pattern.mediator.character.Character;
import jp.ne.naokiur.design.pattern.mediator.character.Farmer;

public interface CrossRiver {
    void cross(Character character);
    void cross(Farmer character, Character withCharacter);
}
