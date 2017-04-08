package jp.ne.naokiur.design.pattern.facade;

public class ServerOperatorFacade {
    private MailManager mailManager;
    private ServerManager serverManager;

    public ServerOperatorFacade() {
        this.mailManager = new MailManager();
        this.serverManager = new ServerManager();
    }

    public boolean upgradeServer() {
        if (!mailManager.sendToCustomer("更新のため、サーバーを停止します。")) return false;
        if (!serverManager.stop()) return false;
        if (!serverManager.upgrade()) return false;

        return true;
    }

    public boolean restartServer() {
        if (!serverManager.start()) return false;
        if (!mailManager.sendToCustomer("更新が完了し、サーバーを再開しました。")) return false;

        return true;
    }
}
