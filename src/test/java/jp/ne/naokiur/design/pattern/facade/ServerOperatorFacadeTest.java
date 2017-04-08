package jp.ne.naokiur.design.pattern.facade;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ServerOperatorFacadeTest {

    @Test
    public void upgradeServerOperation() {
        ServerOperatorFacade operation = new ServerOperatorFacade();

        assertThat(operation.upgradeServer(), equalTo(true));
        assertThat(operation.restartServer(), equalTo(true));
    }

    @Test
    public void upgrade() {
        assertThat(new ServerOperatorFacade().upgradeServer(), equalTo(true));

    }

    @Test
    public void restart() {
        assertThat(new ServerOperatorFacade().restartServer(), equalTo(true));

    }
}
