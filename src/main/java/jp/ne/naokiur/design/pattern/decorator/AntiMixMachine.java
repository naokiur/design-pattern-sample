package jp.ne.naokiur.design.pattern.decorator;

import java.util.List;

public class AntiMixMachine extends MixMachine {
    private int count;

    @Override
    public String mix(String mixingMaterial, String mixedMaterial) {
        count++;
        return super.mix(mixingMaterial, mixedMaterial);
    }

    @Override
    public String mixAll(List<String> materials) {
        count += materials.size();
        return super.mixAll(materials);
    }

    public int getCount() {
        return count;
    }
}
