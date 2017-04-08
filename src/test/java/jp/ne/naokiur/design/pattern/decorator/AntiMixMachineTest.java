package jp.ne.naokiur.design.pattern.decorator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;

import org.junit.Test;

public class AntiMixMachineTest {

    @Test
    public void mixAllCount() {
        AntiMixMachine machine = new AntiMixMachine();
        machine.mixAll(Arrays.asList("suger", "salt"));

        assertThat(machine.getCount(), equalTo(2));
    }
}
