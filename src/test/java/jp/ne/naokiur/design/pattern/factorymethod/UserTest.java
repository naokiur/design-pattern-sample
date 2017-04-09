package jp.ne.naokiur.design.pattern.factorymethod;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class UserTest {

    @Test
    public void normal() {
        User user = new User(new Normal());
        String target = "情報を作成";

        assertThat(user.createInfomation(target), equalTo("Normal : " + target));
    }

    @Test
    public void admin() {
        User user = new User(new Admin());
        String target = "情報を作成";

        assertThat(user.createInfomation(target), equalTo("Admin : " + target));
    }

}
