package com.tutorial;

 class Player {
    // variable
    private String nama;

    // construktor
    Player(String nama){
        this.nama = nama;
    }
    void cetak() {
        System.out.println("Nama : " + this.nama );
    }
 }