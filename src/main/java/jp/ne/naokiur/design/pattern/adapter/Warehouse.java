package jp.ne.naokiur.design.pattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<String> item;

    public Warehouse() {
        this.item = new ArrayList<>();
    }

    public void store(String item) {
        this.item.add(item);
    }

    public List<String> getItem() {
        return item;
    }
}
