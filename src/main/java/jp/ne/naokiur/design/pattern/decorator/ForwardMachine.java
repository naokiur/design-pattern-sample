package jp.ne.naokiur.design.pattern.decorator;

import java.util.List;

public class ForwardMachine implements Mixable {
    private final MixMachine machine;

    public ForwardMachine(MixMachine machine) {
        this.machine = machine;
    }

    @Override
    public String mix(String mixingMaterial, String mixedMaterial) {
        return machine.mix(mixingMaterial, mixedMaterial);
    }

    @Override
    public String mixAll(List<String> materials) {
        return machine.mixAll(materials);
    }
}
