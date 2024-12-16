package com.tutorial;

public class Main{

    public static void main(String[] agrs) {
        // membuat objek dari superclass
        Hero hero1 = new Hero();

        // membuat objek dari sub class
        HeroTank hero2 = new HeeroTank();
        hero1.cetak();
        hero2.cetak();
    }
}