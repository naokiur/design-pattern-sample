package jp.ne.naokiur.design.pattern.mediator.character.notmediator;

import jp.ne.naokiur.design.pattern.mediator.Status;

public class CrossRiverExecutor {
    private Farmer farmer;
    private Wolf wolf;
    private Goat goat;
    private Cabbage cabbage;

    public CrossRiverExecutor(Farmer farmer, Wolf wolf, Goat goat, Cabbage cabbage) {
        this.farmer = farmer;
        this.wolf = wolf;
        this.goat = goat;
        this.cabbage = cabbage;
    }

    public void execute() {
        farmer.cross(goat);
        // こちらの岸：オオカミ、キャベツ
        // 向こう岸：農夫、ヤギ
        updateStatus();

        farmer.cross();
        // こちらの岸：農夫、オオカミ、キャベツ
        // 向こう岸：ヤギ
        updateStatus();

        farmer.cross(cabbage);
        // こちらの岸：オオカミ
        // 向こう岸：農夫、ヤギ、キャベツ
        updateStatus();

        farmer.cross(goat);
        // こちらの岸：農夫、ヤギ、オオカミ
        // 向こう岸：キャベツ
        updateStatus();

        farmer.cross(wolf);
        // こちらの岸：ヤギ
        // 向こう岸：農夫、オオカミ、キャベツ
        updateStatus();

        farmer.cross();
        // こちらの岸：農夫、ヤギ
        // 向こう岸：オオカミ、キャベツ
        updateStatus();

        farmer.cross(goat);
        // こちらの岸：
        // 向こう岸：農夫、オオカミ、ヤギ、キャベツ
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
