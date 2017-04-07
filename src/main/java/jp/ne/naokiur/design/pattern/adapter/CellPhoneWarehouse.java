package jp.ne.naokiur.design.pattern.adapter;

public class CellPhoneWarehouse extends Warehouse implements Shipment {

    @Override
    public void send(String item) {
        System.out.println(item + "を送りました。");
    }
}
