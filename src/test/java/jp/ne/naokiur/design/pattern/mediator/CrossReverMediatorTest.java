package jp.ne.naokiur.design.pattern.mediator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import jp.ne.naokiur.design.pattern.mediator.character.Chabbage;
import jp.ne.naokiur.design.pattern.mediator.character.Farmer;
import jp.ne.naokiur.design.pattern.mediator.character.Goat;
import jp.ne.naokiur.design.pattern.mediator.character.Wolf;

public class CrossReverMediatorTest {
    private Farmer farmer;
    private Wolf wolf;
    private Goat goat;
    private Chabbage chabbage;
    private CrossRiverMediator crossRiver;

    @Before
    public void setUp() {
        farmer = new Farmer();
        wolf = new Wolf();
        goat = new Goat();
        chabbage = new Chabbage();

        crossRiver = new CrossRiverMediator(farmer, wolf, goat, chabbage);
        farmer.setMediator(crossRiver);
        wolf.setMediator(crossRiver);
        goat.setMediator(crossRiver);
        chabbage.setMediator(crossRiver);
    }

    @Test
    public void modelAnswer() {

        farmer.cross(goat);
        farmer.cross();
        farmer.cross(chabbage);
        farmer.cross(goat);
        farmer.cross(wolf);
        farmer.cross();
        farmer.cross(goat);

        assertThat(farmer.getPosition(), equalTo(Position.BEYOND));
        assertThat(wolf.getPosition(), equalTo(Position.BEYOND));
        assertThat(goat.getPosition(), equalTo(Position.BEYOND));
        assertThat(goat.getStatus(), equalTo(Status.ALIVE));
        assertThat(chabbage.getPosition(), equalTo(Position.BEYOND));
        assertThat(chabbage.getStatus(), equalTo(Status.ALIVE));
    }

    @Test
    public void goatIsDead() {

        farmer.cross(chabbage);

        assertThat(farmer.getPosition(), equalTo(Position.BEYOND));
        assertThat(wolf.getPosition(), equalTo(Position.FRONT));
        assertThat(goat.getPosition(), equalTo(Position.FRONT));
        assertThat(goat.getStatus(), equalTo(Status.DEAD));
        assertThat(chabbage.getPosition(), equalTo(Position.BEYOND));
        assertThat(chabbage.getStatus(), equalTo(Status.ALIVE));
    }

    @Test
    public void chabbageIsDead() {

        farmer.cross(wolf);

        assertThat(farmer.getPosition(), equalTo(Position.BEYOND));
        assertThat(wolf.getPosition(), equalTo(Position.BEYOND));
        assertThat(goat.getPosition(), equalTo(Position.FRONT));
        assertThat(goat.getStatus(), equalTo(Status.ALIVE));
        assertThat(chabbage.getPosition(), equalTo(Position.FRONT));
        assertThat(chabbage.getStatus(), equalTo(Status.DEAD));
    }
}
