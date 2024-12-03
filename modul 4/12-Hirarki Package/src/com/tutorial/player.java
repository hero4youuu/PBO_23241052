package com.tutorial;

//import package eksternal
import com.terminal.console;

// visibiliti default hanya bisa di akses oleh 
// package (folder) yang sama 
class player {
    // variable objek
    private String nama;

    // konstruktor 
    player(String nama) {
        this.nama = nama;
    }

    // method cetak
    void cetak(){
        //System.out.println("Nama : " + this.nama);
        console.log("menggunakan console");
        console.log("nama : "  + this.nama);
    }
        //method getter 
        String getnama(){
            return this.nama;
        }
    }
    

