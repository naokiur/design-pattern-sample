package jp.ne.naokiur.design.pattern.proxy;

public class User {
    private UserRequest request;

    public UserRequest getRequest() {
        return request;
    }

    public void setRequest(UserRequest request) {
        this.request = request;
    }
}
