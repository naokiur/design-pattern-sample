package jp.ne.naokiur.design.pattern.mediator.character;

public class Farmer extends CharacterBase {
    public void cross(Character withCharacter) {
        this.crossRiver.cross(this, withCharacter);
    }
}
