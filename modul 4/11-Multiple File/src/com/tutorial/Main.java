package com.tutorial;

import com.terminal.Console;

class Main {
    public static void main(String[] args ) {
    // membuat objek
    Player player1 = new Player("jaja");
    Player player2 = new Player("jeje");
    Player player3 = new Player("jojo");
    player1.cetak();
    player2.cetak();
    player3.cetak();

    Console.log("Hallo");
  }
}