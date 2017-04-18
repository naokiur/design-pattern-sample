package jp.ne.naokiur.design.pattern.iterator;

public interface Iterator {
    boolean hasNext();
    boolean isMatchedAge(Integer age);
    Employee next();
    Employee current();

}
