package jp.ne.naokiur.design.pattern.decorator;

import java.util.List;

public class CountableMixMachine extends ForwardMachine {
    private int count;

    public CountableMixMachine(MixMachine machine) {
        super(machine);
    }

    @Override
    public String mix(String mixingMaterial, String mixedMaterial) {
        count++;
        return super.mix(mixingMaterial, mixedMaterial);
    }

    public String mixAll(List<String> materials) {
        count += materials.size();

        return super.mixAll(materials);
    }

    public int getCount() {
        return count;
    }
}
