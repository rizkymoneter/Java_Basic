package com.dicoding.javafundamental.kelas;


import java.util.Scanner;

public class KucingAnggora {




    String namaKucing,g ;
    int beratBadan, h;

    public KucingAnggora(String nama, int berat) {
        namaKucing = nama;
        beratBadan = berat;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan nama : ");
        String a = scanner.next();
        System.out.print("masukkan berat : ");
        int b = scanner.nextInt();

    }


}
