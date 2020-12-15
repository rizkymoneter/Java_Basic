package com.dicoding.javafundamental.kelas;

public class hewan {
    String nama;
    int berat;
    int jumlahKaki;

    // Ini merupakan konstruktor dari kelas hewan. konstruktor adalah method yang pertama kali dijalankan ketika object diciptakan.

    public hewan(String namaHewan) {
        nama = namaHewan;
    }
    public void beratHewan(int beratHewan) {
        berat = beratHewan;
    }
    public void jumlahKakiHewan(int jumlahKakiHewan) {
        jumlahKaki = jumlahKakiHewan;
    }

    public void cetakHewan() {
        System.out.println("Nama hewan : " + nama);
        System.out.println("Berat hewan : " + berat + " kg");
        System.out.println("Jumlah kaki: " + jumlahKaki);
    }

    public static void main(String[] args) {
        hewan Elang = new hewan("Elang");
        hewan Kucing = new hewan("Kucing");
        Elang.beratHewan(5);
        Elang.jumlahKakiHewan(2);
        Elang.cetakHewan();
        Kucing.beratHewan(2);
        Kucing.jumlahKakiHewan(4);
        Kucing.cetakHewan();
    }

}
