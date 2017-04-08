package jp.ne.naokiur.design.pattern.decorator;

import java.util.List;

public interface Mixable {
    String mix(String mixingMaterial, String mixedMaterial);
    String mixAll(List<String> materials);
}
