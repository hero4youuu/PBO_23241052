package com.tutorial;

public class PersegiPanjang extends BangunanDatar {
    float panjang, lebar;

    // Constructor Default
    public PersegiPanjang() {
        super();
        this.panjang = 0;
        this.lebar = 0;
    }

    // Constructor Overloading
    public PersegiPanjang(float panjang, float lebar) {
        super();
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public float luas() {
        return panjang * lebar;
    }

    @Override
    public float keliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public void Cetak() {
        System.out.println(" Persegi Panjang - panjang = " + panjang + ", lebar = " + lebar + ", luas = " + luas() + ", keliling = " + keliling());
    }
}
