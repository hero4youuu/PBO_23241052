package com.tutorial;

public class HeroTank extends Hero{
    // atribut 
    String atribut = "Tank";

    // constructor di dalam sub class
    HeroTank(String nama, double defense, double Attack){
        super(nama, defense, Attack);
    }
    //overriding cetak 
    void cetak(){
        System.out.println("Hero : " + this.atribut);
        super.cetak();
    }

    
}
