package jp.ne.naokiur.design.pattern.proxy;

public class UserRequest {
    private String username;
    private String password;
    private String targetWord;

    public UserRequest() {
    }

    public UserRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserRequest(String username, String password, String targetWord) {
        this.username = username;
        this.password = password;
        this.targetWord = targetWord;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTargetWord() {
        return targetWord;
    }

    public void setTargetWord(String targetWord) {
        this.targetWord = targetWord;
    }

}
