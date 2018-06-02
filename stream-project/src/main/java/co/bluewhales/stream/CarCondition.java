package co.bluewhales.stream;

public enum CarCondition {
    R("ReCondition"),
    B("BranNew"),
    UNKNOWN("");

    private String url;

    CarCondition(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
