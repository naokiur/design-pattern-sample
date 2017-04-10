package jp.ne.naokiur.design.pattern.proxy;

public class Proxy implements InternetConnection {
    InternetConnection internet;
    private final String AUTHENTICATED_NAME = "John";
    private final String AUTHENTICATED_PASSWORD = "password!";

    public Proxy() {
        this.internet = new Internet();
    }

    @Override
    public boolean ping() {
        return true;
    }

    @Override
    public String connect(UserRequest request) {
        if (isAuthentication(request)) {
            return internet.connect(request);
        }

        return "Authentication Error.";
    }

    @Override
    public String search(UserRequest request) {
        if (isAuthentication(request)) {

            if (request.getTargetWord() == null || "".equals(request.getTargetWord())) {
                return "Target word is empty.";
            }

            return internet.search(request);
        }

        return "Authentication Error.";
    }

    private boolean isAuthentication(UserRequest request) {
        if (request == null) {
            return false;
        }

        if (AUTHENTICATED_NAME.equals(request.getUsername()) && AUTHENTICATED_PASSWORD.equals(request.getPassword())) {
            return true;
        }

        return false;
    }
}
