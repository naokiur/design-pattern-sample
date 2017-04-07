package jp.ne.naokiur.design.pattern.adapter;

import org.junit.Test;

public class LogisticsCenterTest {

    @Test
    public void test() {
        LogisticsCenter logi = new LogisticsCenter(new Warehouse());
        logi.getWarehouse().store("果物");
        logi.outputItemList();

        LogisticsCenter logi2 = new LogisticsCenter(new CellPhoneWarehouse());
        logi.setWarehouse(new CellPhoneWarehouse());
        logi.getWarehouse().store("携帯電話");
//        logi.getWarehouse().
    }
}
