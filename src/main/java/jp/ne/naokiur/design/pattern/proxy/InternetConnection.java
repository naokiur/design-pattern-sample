package jp.ne.naokiur.design.pattern.proxy;

public interface InternetConnection {
    boolean ping();
    String connect(UserRequest request);
    String search(UserRequest request);
}
