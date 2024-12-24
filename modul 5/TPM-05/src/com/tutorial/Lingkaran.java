package com.tutorial;

public class Lingkaran extends BangunanDatar {
    float r;

    // Constructor Default
    public Lingkaran() {
        super();
        this.r = 0;
    }

    // Constructor Overloading
    public Lingkaran(float r) {
        super();
        this.r = r;
    }

    @Override
    public float luas() {
        return (float) (Math.PI * r * r);
    }

    @Override
    public float keliling() {
        return (float) (2 * Math.PI * r);
    }

    @Override
    public void Cetak() {
        System.out.println("Lingkaran - jari-jari = " + r + ", luas = " + luas() + ", keliling = " + keliling());
    }
}
