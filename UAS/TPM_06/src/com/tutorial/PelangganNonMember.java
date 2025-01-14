package com.tutorial;

class PelangganNonMember extends Pelanggan {
    private double potonganNonMember = 0.03; // 3% untuk belanja > 100.000

    
    public PelangganNonMember(String nama, double totalBelanja) {
        super(nama, false, totalBelanja); // Memanggil constructor superclass
    }

    // hitung diskon untuk non-member
    public double hitungDiskon() {
        if (totalBelanja > 100000) {
            return totalBelanja * potonganNonMember;
        }
        return 0; // Tidak ada potongan untuk belanja <= 100.000
    }

    // mencetak rincian belanja untuk non-member
    public void cetak() {
        // Mencetak rincian untuk pelanggan non-member
        System.out.println("Nama Pelanggan: " + nama + " (Non-Member)");
        System.out.println("Total Belanja Sebelum Diskon: Rp " + totalBelanja);
        System.out.println("Diskon (Dalam Persen): " + (hitungDiskon() / totalBelanja * 100) + "%");
        System.out.println("Diskon (Dalam Rupiah): Rp " + hitungDiskon());
        System.out.println("Total Belanja Setelah Diskon: Rp " + (totalBelanja - hitungDiskon()));
    }
}
