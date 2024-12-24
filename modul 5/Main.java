package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // Polimorfisme - Referensi superclass untuk objek subclass
        BangunanDatar bd;

        System.out.println("Persegi");
        bd = new Persegi(5);
        bd.Cetak();

        System.out.println("Lingkaran");
        bd = new Lingkaran(7);
        bd.Cetak();

        System.out.println(" Persegi Panjang");
        bd = new PersegiPanjang(8, 4);
        bd.Cetak();

        System.out.println("Segitiga");
        bd = new Segitiga(6, 3);
        bd.Cetak();
    }
}
