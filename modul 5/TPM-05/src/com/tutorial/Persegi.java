package com.tutorial;

public class Persegi extends BangunanDatar {
    float sisi;

    // Constructor Default
    public Persegi() {
        super(); // Memanggil constructor superclass
        this.sisi = 0;
    }

    // Constructor Overloading
    public Persegi(float sisi) {
        super(); // Memanggil constructor superclass
        this.sisi = sisi;
    }

    public float luas() {
        return sisi * sisi;
    }

    public float keliling() {
        return 4 * sisi;
    }

    public void Cetak() {
        System.out.println("Persegi - sisi = " + sisi + ", luas = " + luas() + ", keliling = " + keliling());
    }
}
