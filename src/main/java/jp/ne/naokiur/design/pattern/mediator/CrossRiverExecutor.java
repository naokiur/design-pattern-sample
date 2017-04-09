package jp.ne.naokiur.design.pattern.mediator;

import jp.ne.naokiur.design.pattern.mediator.character.Cabbage;
import jp.ne.naokiur.design.pattern.mediator.character.Farmer;
import jp.ne.naokiur.design.pattern.mediator.character.Goat;
import jp.ne.naokiur.design.pattern.mediator.character.Wolf;

public class CrossRiverExecutor {
    private Farmer farmer;
    private Wolf wolf;
    private Goat goat;
    private Cabbage cabbage;
    private CrossRiverMediator crossRiver;

    public CrossRiverExecutor() {
        farmer = new Farmer();
        wolf = new Wolf();
        goat = new Goat();
        cabbage = new Cabbage();

        crossRiver = new CrossRiverMediator(farmer, wolf, goat, cabbage);
        farmer.setMediator(crossRiver);
        wolf.setMediator(crossRiver);
        goat.setMediator(crossRiver);
        cabbage.setMediator(crossRiver);
    }

    public void execute() {
        farmer.cross(goat);     // こちらの岸：オオカミ、キャベツ      向こう岸：農夫、ヤギ
        farmer.cross();         // こちらの岸：農夫、オオカミ、キャベツ 向こう岸：ヤギ
        farmer.cross(cabbage);  // こちらの岸：オオカミ              向こう岸：農夫、ヤギ、キャベツ
        farmer.cross(goat);     // こちらの岸：農夫、ヤギ、オオカミ    向こう岸：キャベツ
        farmer.cross(wolf);     // こちらの岸：ヤギ                 向こう岸：農夫、オオカミ、キャベツ
        farmer.cross();         // こちらの岸：農夫、ヤギ            向こう岸：オオカミ、キャベツ
        farmer.cross(goat);     // こちらの岸：                    向こう岸：農夫、オオカミ、ヤギ、キャベツ
    }
}
