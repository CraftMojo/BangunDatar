package com.craftmojo;

public class Segitiga implements Shape{
    private double alas;
    private double tinggi;

    @Override
    public Double hitungLuas() {
        return (alas * tinggi)/2;
    }

    @Override
    public void getInput() {
        System.out.print("Masukkan alas: ");
        alas = scan.nextDouble();
        System.out.print("Masukkan tinggi: ");
        tinggi = scan.nextDouble();

    }

}
