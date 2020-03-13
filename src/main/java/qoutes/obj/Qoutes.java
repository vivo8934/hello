package qoutes.obj;

public class Qoutes {
    private String value;
    private  String by;

    public Qoutes(String value, String by){
        this.value = value;
        this.by = by;
    }

    public Qoutes() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }
}
