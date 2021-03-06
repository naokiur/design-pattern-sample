package jp.ne.naokiur.design.pattern.mediator;

import jp.ne.naokiur.design.pattern.mediator.character.Cabbage;
import jp.ne.naokiur.design.pattern.mediator.character.Character;
import jp.ne.naokiur.design.pattern.mediator.character.Farmer;
import jp.ne.naokiur.design.pattern.mediator.character.Goat;
import jp.ne.naokiur.design.pattern.mediator.character.Wolf;

public class CrossRiverMediator implements CrossRiver {
    private Farmer farmer;
    private Wolf wolf;
    private Goat goat;
    private Cabbage cabbage;

    public CrossRiverMediator(Farmer farmer, Wolf wolf, Goat goat, Cabbage cabbage) {
        this.farmer = farmer;
        this.wolf = wolf;
        this.goat = goat;
        this.cabbage = cabbage;
    }

    @Override
    public void cross(Character character) {

        switch (character.getPosition()) {
        case FRONT:
            character.setPosition(Position.BEYOND);

            break;

        case BEYOND:
            character.setPosition(Position.FRONT);

            break;

        default:
            break;
        }
    }

    @Override
    public void cross(Farmer character, Character withCharacter) {
        if (withCharacter == null) {
            throw new IllegalArgumentException("一緒に渡るキャラクターを指定して下さい。");
        }

        if (withCharacter instanceof Farmer) {
            throw new IllegalArgumentException("農夫を指定することはできません。");
        }

        if (!character.getPosition().equals(withCharacter.getPosition())) {
            throw new IllegalArgumentException("同じ位置にいるキャラクターのみ、一緒に渡ることができます。");

        }

        character.cross();
        withCharacter.cross();
        updateStatus();
    }

    private void updateStatus() {
        if (!farmer.getPosition().equals(goat.getPosition()) && wolf.getPosition().equals(goat.getPosition())) {
            goat.setStatus(Status.DEAD);
        }

        if (!farmer.getPosition().equals(cabbage.getPosition()) && cabbage.getPosition().equals(goat.getPosition())) {
            cabbage.setStatus(Status.DEAD);
        }

    }
}
