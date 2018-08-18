package com.akaprod.agung.blablagit;

public class dataModel {

    String ty, de, ex;

    public dataModel(String ty, String de, String ex) {
        this.ty = ty;
        this.de = de;
        this.ex = ex;
    }

    public dataModel() {
    }

    public String getTy() {
        return ty;
    }

    public void setTy(String ty) {
        this.ty = ty;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }
}
