package com.tutorial;

import com.terminal.console;

import static com.terminal.console.log;

public class Main {
    public static void main(String[] args) {
        // membuat objek
        player player1 = new player("sandi");
        player1.cetak();
        console.log("menampilkan data dari console");
        console.log("player nama : " + player1.getnama());

        log("menggunakan static log");
        log(player1.getnama());
    }
    
}
