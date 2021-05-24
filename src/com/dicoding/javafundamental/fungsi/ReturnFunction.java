package com.dicoding.javafundamental.fungsi;

public class ReturnFunction {
    public static void main(String[] args) {
        double p = 7;
        double l = 6.5;
        double hasil = hitungluas(p,l); //memanggil fungsi
        System.out.printf("hasil = " + hasil);
    }

    public static double hitungluas(double panjang, double lebar){
        double luas = panjang * lebar;
        return luas;
    }
}
