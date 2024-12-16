package com.tutorial;

// sbu class
public class HeroTank extends Hero {
    // overriding
    double defensePower;

    //overriding method
    void cetak() {
        System.out.println("/nHero dari sub class");
        System.out.println("Hero Tank");
        System.out.println("Hero Nama : " + this.nama);
        System.out.println("Defense Power : " + this.nama);
    }
    
}
