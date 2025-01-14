package com.tutorial;

class PelangganMember extends Pelanggan {
    private double potonganHigh = 0.1;  // 10% untuk belanja > 500.000
    private double potonganMedium = 0.05; // 5% untuk belanja 100.000 - 499.999
    private double potonganLow = 0.03; // 3% untuk belanja < 100.000


    public PelangganMember(String nama, double totalBelanja) {
        super(nama, true, totalBelanja); 
    }

    // hitung diskon untuk member
    public double hitungDiskon() {
        if (totalBelanja > 500000) {
            return totalBelanja * potonganHigh;
        } else if (totalBelanja >= 100000) {
            return totalBelanja * potonganMedium;
        } else {
            return totalBelanja * potonganLow;
        }
    }

    // mencetak rincian belanja untuk member
    public void cetak() {
        // Mencetak rincian untuk pelanggan member
        System.out.println("Nama Pelanggan: " + nama + " (Member)");
        System.out.println("Total Belanja Sebelum Diskon: Rp " + totalBelanja);
        System.out.println("Diskon (Dalam Persen): " + (hitungDiskon() / totalBelanja * 100) + "%");
        System.out.println("Diskon (Dalam Rupiah): Rp " + hitungDiskon());
        System.out.println("Total Belanja Setelah Diskon: Rp " + (totalBelanja - hitungDiskon()));
    }
}