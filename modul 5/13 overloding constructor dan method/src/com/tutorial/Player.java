package com.tutorial;

public class Player {
    // altribut 
    private String name;
    private static int JumblahPlayer;

    // constructor
    //opsi 1 untuk membuat objek
    Player(String name) {
        Player.JumblahPlayer++;
        this.name = name;
    }
    // overloding costructor
    //opsi 2 untuk membuat objek
    Player() {
        Player.JumblahPlayer++;
        this.name = "Player" + Player.JumblahPlayer;

    }
    // method 
    void cetak(){
        System.out.println("name : " + this.name);
    }
}
