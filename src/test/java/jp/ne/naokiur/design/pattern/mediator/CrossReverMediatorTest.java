package jp.ne.naokiur.design.pattern.mediator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import jp.ne.naokiur.design.pattern.mediator.character.Cabbage;
import jp.ne.naokiur.design.pattern.mediator.character.Farmer;
import jp.ne.naokiur.design.pattern.mediator.character.Goat;
import jp.ne.naokiur.design.pattern.mediator.character.Wolf;

public class CrossReverMediatorTest {
    private Farmer farmer;
    private Wolf wolf;
    private Goat goat;
    private Cabbage cabbage;
    private CrossRiverMediator crossRiver;

    @Before
    public void setUp() {
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

    @Test
    public void modelAnswer() {

        farmer.cross(goat);
        farmer.cross();
        farmer.cross(cabbage);
        farmer.cross(goat);
        farmer.cross(wolf);
        farmer.cross();
        farmer.cross(goat);

        assertThat(farmer.getPosition(), equalTo(Position.BEYOND));
        assertThat(wolf.getPosition(), equalTo(Position.BEYOND));
        assertThat(goat.getPosition(), equalTo(Position.BEYOND));
        assertThat(goat.getStatus(), equalTo(Status.ALIVE));
        assertThat(cabbage.getPosition(), equalTo(Position.BEYOND));
        assertThat(cabbage.getStatus(), equalTo(Status.ALIVE));
    }

    @Test
    public void goatIsDead() {

        farmer.cross(cabbage);

        assertThat(farmer.getPosition(), equalTo(Position.BEYOND));
        assertThat(wolf.getPosition(), equalTo(Position.FRONT));
        assertThat(goat.getPosition(), equalTo(Position.FRONT));
        assertThat(goat.getStatus(), equalTo(Status.DEAD));
        assertThat(cabbage.getPosition(), equalTo(Position.BEYOND));
        assertThat(cabbage.getStatus(), equalTo(Status.ALIVE));
    }

    @Test
    public void chabbageIsDead() {

        farmer.cross(wolf);

        assertThat(farmer.getPosition(), equalTo(Position.BEYOND));
        assertThat(wolf.getPosition(), equalTo(Position.BEYOND));
        assertThat(goat.getPosition(), equalTo(Position.FRONT));
        assertThat(goat.getStatus(), equalTo(Status.ALIVE));
        assertThat(cabbage.getPosition(), equalTo(Position.FRONT));
        assertThat(cabbage.getStatus(), equalTo(Status.DEAD));
    }
}
