package jp.ne.naokiur.design.pattern.decorator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;

import org.junit.Test;

public class CountableMixMachineTest {

    @Test
    public void mixAllCount() {
        CountableMixMachine machine = new CountableMixMachine(new MixMachine());
        machine.mixAll(Arrays.asList("suger", "salt"));

        assertThat(machine.getCount(), equalTo(2));
    }
}
