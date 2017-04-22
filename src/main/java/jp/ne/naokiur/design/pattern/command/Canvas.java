package jp.ne.naokiur.design.pattern.command;

public class Canvas {
    private String field = "";

    public void addArt(String art) {
        this.field = field + art;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
