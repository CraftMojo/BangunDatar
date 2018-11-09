package com.craftmojo;

public class PersegiPanjang implements Shape{
    private double l;
    private double p;

    @Override
    public Double hitungLuas() {
        return p * l;
    }

    @Override
    public void getInput() {
        System.out.print("Masukkan panjang: ");
        p = scan.nextDouble();

        System.out.print("Masukkan lebar: ");
        l = scan.nextDouble();
    }
}
