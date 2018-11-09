package com.craftmojo;

public class Persegi implements Shape{
    private double sisi;

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public Double hitungLuas() {
        return sisi * sisi;
    }
}
