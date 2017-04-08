package jp.ne.naokiur.design.pattern.facade;

public class ServerManager {
    public boolean start() {
        System.out.println("サーバーを起動しました。");
        return true;
    }

    public boolean stop() {
        System.out.println("サーバーを停止しました。");
        return true;
    }

    public boolean upgrade() {
        System.out.println("サーバーを更新しました。");

        return true;
    }
}
