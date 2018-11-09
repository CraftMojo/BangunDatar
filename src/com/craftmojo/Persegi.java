package com.craftmojo;

public class Persegi implements Shape{
    private double sisi;

    @Override
    public Double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public void getInput() {
        System.out.print("Masukkan sisi: ");
        sisi = scan.nextDouble();
    }
}
