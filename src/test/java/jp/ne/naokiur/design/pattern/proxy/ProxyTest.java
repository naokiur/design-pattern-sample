package jp.ne.naokiur.design.pattern.proxy;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class ProxyTest {

    @Test
    public void test_ping() {
        Proxy proxy = new Proxy();

        assertThat(proxy.ping(), equalTo(true));
    }

    @Test
    public void authentication_error_request_is_null() {
        Proxy proxy = new Proxy();
        User john = new User();

        assertThat(proxy.connect(john.getRequest()), equalTo("Authentication Error."));
    }

    @Test
    public void authentication_error_unmatch_username_password() {
        Proxy proxy = new Proxy();
        User john = new User();
        john.setRequest(new UserRequest("john", "pass"));

        assertThat(proxy.connect(john.getRequest()), equalTo("Authentication Error."));
    }

    @Test
    public void connection_success() {
        Proxy proxy = new Proxy();
        User john = new User();
        john.setRequest(new UserRequest("John", "password!"));

        assertThat(proxy.connect(john.getRequest()), equalTo("Welcome John !!"));
    }

    @Test
    public void search_success() {
        Proxy proxy = new Proxy();
        User john = new User();
        john.setRequest(new UserRequest("John", "password!", "Test"));

        assertThat(proxy.search(john.getRequest()), equalTo("Test Page."));
    }
}
