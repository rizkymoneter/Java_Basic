package com.dicoding.javafundamental.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {

    public static void main(String[] args) {

    InputStreamReader steamReader = new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(steamReader);
    System.out.println("Program penjumlahan sederhana");
    int value = 0;
    int anotherValue = 0;
        try {
            System.out.print("Masukkan Angka pertama : ");
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.printf("Masukka Angka kedua : ");
            anotherValue = Integer.parseInt(bufferedReader.readLine());
        }
        catch (IOException e){
            e.printStackTrace();
        }
        int result = value + anotherValue;
        System.out.println("Hasillnya adalah : " + result);

    }


}
