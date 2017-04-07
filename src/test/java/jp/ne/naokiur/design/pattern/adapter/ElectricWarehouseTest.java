package jp.ne.naokiur.design.pattern.adapter;

import org.junit.Test;

public class ElectricWarehouseTest {

    @Test
    public void test() {
        ElectricWarehouse warehouse = new ElectricWarehouse();
        warehouse.store("電子ファイル");
        warehouse.send();
    }
}
