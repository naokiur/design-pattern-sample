package jp.ne.naokiur.design.pattern.adapter;

public class LogisticsCenter {
    private Warehouse warehouse;

    public LogisticsCenter(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void outputItemList() {
        for (String item : warehouse.getItem()) {
            System.out.println(item);
        }
    }
}
