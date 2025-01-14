package com.tutorial;

public class Main {
    public static void main(String[] args) {
      // Membuat objek pelanggan dengan berbagai total belanja
      PelangganMember pelanggan1 = new PelangganMember("ipan", 600000);
      PelangganMember pelanggan2 = new PelangganMember("tio", 190000);
      PelangganNonMember pelanggan3 = new PelangganNonMember("rangga", 150000);

      // Mencetak untuk menampilkan rincian pelanggan
      pelanggan1.cetak();
      System.out.println();
      pelanggan2.cetak();
      System.out.println();
      pelanggan3.cetak();
      System.out.println();
  }
}