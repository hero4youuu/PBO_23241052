package com.tutorial;

public class HeeroTank extends Hero{
    // atribut baru
    String nama = "class haro tank";

    // overriding method 
    void cetak() {
        System.out.println("ini adalah " + su .nama);
        super.dummyMathod();
    }
    void dummyMathod(){
    System.out.println("ini ada di sub class ")
    }
}