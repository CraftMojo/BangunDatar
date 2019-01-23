package com.craftmojo;

public class JajaranGenjang implements Shape {
    private double r;
    private static final double phi = 3.14;

    @Override
    public Double hitungLuas() {

        return phi * r * r;
    }

    @Override
    public void getInput() {
        System.out.print("Masukkan jari-jari: ");
        r = scan.nextDouble();

    }
}

