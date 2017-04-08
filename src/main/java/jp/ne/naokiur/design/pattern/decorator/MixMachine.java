package jp.ne.naokiur.design.pattern.decorator;

import java.util.List;

public class MixMachine implements Mixable {

    @Override
    public String mix(String mixingMaterial, String mixedMaterial) {
        return mixingMaterial + " : " + mixedMaterial;
    }

    @Override
    public String mixAll(List<String> materials) {
        String result = "";

        for (String matelial : materials) {
            if ("".equals(result)) {
                result = matelial;
            } else {
                result = mix(result, matelial);

            }
        }

        return result;
    }
}
