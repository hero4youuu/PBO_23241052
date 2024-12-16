package com.tutorial;


public class Main {
    public static void main(String[] args) {
        // membuat objek dari super class
        Hero hero1 = new Hero();
        hero1.nama = "melati";
        System.out.println("Hero dari super class");
        hero1.cetak();

        // membuat objek dari sub class 
        HeroTank hero2 = new HeroTank();
        hero2.nama = "Diplo";
        hero2.defensePower = 100;
        hero2.cetak();
    }
    
}
