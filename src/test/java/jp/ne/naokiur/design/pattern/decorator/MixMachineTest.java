package jp.ne.naokiur.design.pattern.decorator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Test;

public class MixMachineTest {

    @Test
    public void mix() {
        MixMachine machine = new MixMachine();
        String actual = machine.mix("sugar", "salt");

        assertThat(actual, equalTo("sugar : salt"));
    }

    @Test
    public void mixAll() {
        MixMachine machine = new MixMachine();
        String actual = machine.mixAll(Arrays.asList("sugar", "salt"));

        assertThat(actual, equalTo("sugar : salt"));
    }
}
