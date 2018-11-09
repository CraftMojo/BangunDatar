package com.craftmojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    private static void tanya(List<Shape> bangunDatar) {
        System.out.print("Masukkan pilihan bangun datar: \n" +
                "0. Stop \n");
        int i = 1;
        for (Shape aBangunDatar : bangunDatar) {
            System.out.println(i++ + ". " + aBangunDatar.getClass().getSimpleName());
        }
        System.out.print("Masukkan pilihan: ");
    }

    private static List<Shape> getShapes() {
        List<Shape> bangunDatar = new ArrayList<>();
        bangunDatar.add(new Persegi());
        bangunDatar.add(new Lingkaran());
        bangunDatar.add(new Segitiga());
        bangunDatar.add(new PersegiPanjang());
        return bangunDatar;
    }

    public static void main(String[] args) {
        List<Shape> bangunDatar = getShapes();

        boolean ulang = true;
        while (ulang) {
            tanya(bangunDatar);

            int pilih = scan.nextInt();
            if (pilih == 0) {
                System.out.println();
                System.out.println("Good Bye!");
                ulang = false;
                continue;

            }

            if (pilih > bangunDatar.size()) {
                System.out.println();
                System.out.println("Mohon masukkan yang benar!!! ");
                continue;
            }

            Shape bangun = bangunDatar.get(pilih - 1);
            bangun.getInput();
            System.out.println("Luas Bangun " + bangun.getClass().getSimpleName()
                    + ":" + bangun.hitungLuas());
            System.out.println();

        }
    }

}
