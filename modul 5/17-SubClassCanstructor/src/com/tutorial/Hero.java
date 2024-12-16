package com.tutorial;

public class Hero {
    // atribut
    String nama;
    double defensePower;
    double attackPower;

    //constructor
    Hero(String nama, double defensePower, double attackPower) {
        this.nama = nama;
        this.defensePower = defensePower;
        this.attackPower = attackPower;
    }

    //method
   void cetak() {
    System.out.println("Nama : " + this.nama);
    System.out.println("defense Power " + this.defensePower);
    System.out.println("attack Power" + this.attackPower);
   }
}
