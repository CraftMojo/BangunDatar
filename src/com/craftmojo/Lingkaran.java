package com.craftmojo;

import org.omg.CORBA.Object;

public class Lingkaran implements Shape {
    private double r;
    private static final double phi = 3.14;

    Lingkaran(){

    }

    @Override
    public Double hitungLuas() {

        return phi * r * r;
    }

    @Override
    public void getInput() {
        System.out.print("Masukkan jari-jari: ");
        r = scan.nextDouble();

        //test all cases test

        //nambah
    }
}
