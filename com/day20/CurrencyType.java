package com.day20;

public class CurrencyType {
    private int id;
    private String code;
    private String type;

    public CurrencyType(int id, String code, String type) {
        this.id = id;
        this.code = code;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
