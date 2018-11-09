package com.craftmojo;

public class Segitiga implements Shape{
    private double alas;
    private double tinggi;

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public Double hitungLuas() {
        return (alas * tinggi)/2;
    }

}
