package com.tutorial;

public class Segitiga extends BangunanDatar {
    float alas, tinggi;

    // Constructor Default
    public Segitiga() {
        super();
        this.alas = 0;
        this.tinggi = 0;
    }

    // Constructor Overloading
    public Segitiga(float alas, float tinggi) {
        super();
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public void Cetak() {
        System.out.println("Segitiga - alas = " + alas + ", tinggi = " + tinggi + ", luas = " + luas());
    }
}
