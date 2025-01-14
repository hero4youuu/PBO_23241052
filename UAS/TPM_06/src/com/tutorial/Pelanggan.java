package com.tutorial;

class Pelanggan {
    protected String nama;
    protected boolean memilikiKartuMember;
    protected double totalBelanja;

    
    public Pelanggan(String nama) {
        this.nama = nama;
        this.memilikiKartuMember = false;
        this.totalBelanja = 0;
    }

    public Pelanggan(String nama, boolean memilikiKartuMember, double totalBelanja) {
        this.nama = nama;
        this.memilikiKartuMember = memilikiKartuMember;
        this.totalBelanja = totalBelanja;
    }

    //  untuk menghitung potongan
    public double hitungDiskon() {
        return 0;
    }

    public void cetak() {
        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("Status Kartu Member: " + (memilikiKartuMember ? "Ya" : "Tidak"));
        System.out.println("Total Belanja: Rp " + totalBelanja);
    }
}