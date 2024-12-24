package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // Polimorfisme - Referensi superclass untuk objek subclass
        BangunanDatar bd;

        System.out.println("=== Persegi ===");
        bd = new Persegi(5);
        bd.Cetak();

        System.out.println("\n=== Lingkaran ===");
        bd = new Lingkaran(7);
        bd.Cetak();

        System.out.println("\n=== Persegi Panjang ===");
        bd = new PersegiPanjang(8, 4);
        bd.Cetak();

        System.out.println("\n=== Segitiga ===");
        bd = new Segitiga(6, 3);
        bd.Cetak();
    }
}
