package jp.ne.naokiur.design.pattern.mediator.character.notmediator;

public class Farmer extends CharacterBase {
    public void cross(Character withCharacter) {
        if (withCharacter == null) {
            throw new IllegalArgumentException("一緒に渡るキャラクターを指定して下さい。");
        }

        if (withCharacter instanceof Farmer) {
            throw new IllegalArgumentException("農夫を指定することはできません。");
        }

        if (!this.getPosition().equals(withCharacter.getPosition())) {
            throw new IllegalArgumentException("同じ位置にいるキャラクターのみ、一緒に渡ることができます。");

        }

        this.cross();
        withCharacter.cross();
    }
}
