package com.example.intent_emplicit_truyen_va_nhan_bundle;

import java.io.Serializable;

public class SinhVien implements Serializable {
    private  String name;
    private  int old;
    private  String address;

    public SinhVien(String name, int old, String address) {
        this.name = name;
        this.old = old;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
