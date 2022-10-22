package com.geektech.bindinghomeworkcontinent;

public class Country {
    private String nameCountry;
    private String nameCapital;
    private int flag;
    private int key_id;

    public Country(String nameCountry, String nameCapital, int flag, int key_id) {
        this.nameCountry = nameCountry;
        this.nameCapital = nameCapital;
        this.flag = flag;
        this.key_id = key_id;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public String getNameCapital() {
        return nameCapital;
    }

    public void setNameCapital(String nameCapital) {
        this.nameCapital = nameCapital;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getKey_id() {
        return key_id;
    }

    public void setKey_id(int key_id) {
        this.key_id = key_id;
    }
}
