package jp.ne.naokiur.design.pattern.adapter;

public class ElectricWarehouse extends Warehouse implements ElectricTransfer {

    @Override
    public void send() {
        for (String itemContent : item) {
            System.out.println(itemContent + "を電子転送しました。");
        }
    }
}
