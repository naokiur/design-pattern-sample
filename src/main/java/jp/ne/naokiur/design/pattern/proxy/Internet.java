package jp.ne.naokiur.design.pattern.proxy;

public class Internet implements InternetConnection {

    @Override
    public boolean ping() {
        return true;
    }

    @Override
    public String connect(UserRequest request) {
        return "Welcome " + request.getUsername() + " !!";
    }

    @Override
    public String search(UserRequest request) {
        return request.getTargetWord() + " Page.";
    }

}
