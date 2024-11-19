class Gaji {
    // Data member atau variabel instan
    private int gajiPokok;
    private int tunjangan;
    private double pajak; // dalam persen

    // Constructor, tanpa modifier akses
    public Gaji() {
        this.gajiPokok = 0;
        this.tunjangan = 0;
        this.pajak = 0;
    }

    // Setter untuk Gaji Pokok
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Getter untuk Gaji Pokok
    public int getGajiPokok() {
        return this.gajiPokok;
    }

    // Setter untuk Tunjangan
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    // Getter untuk Tunjangan
    public int getTunjangan() {
        return this.tunjangan;
    }

    // Setter untuk Pajak (dalam persen)
    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    // Getter untuk Pajak (dalam persen)
    public double getPajak() {
        return this.pajak;
    }

    // Method untuk menghitung Gaji Bersih (menggunakan int)
    public int hitungGajiBersih() {
        int totalGaji = this.gajiPokok + this.tunjangan;
        int pajakRupiah = (int) ((this.pajak / 100) * totalGaji); // Menghitung pajak dalam rupiah dan dibulatkan ke int
        return totalGaji - pajakRupiah;
    }

    // Method untuk mencetak Gaji Bersih
    public void cetakGajiBersih() {
        System.out.println("Gaji Pokok   : " + this.gajiPokok);
        System.out.println("Tunjangan    : " + this.tunjangan);
        System.out.println("Pajak        : " + this.pajak + "%");
        System.out.println("Gaji Bersih  : " + hitungGajiBersih());
    }
}

public class App {
    public static void main(String[] args) {
        // Instansiasi objek Gaji
        Gaji gaji1 = new Gaji();

        // Mengisi data secara langsung tanpa input dari pengguna
        gaji1.setGajiPokok(5000000);   // Gaji Pokok: 5.000.000
        gaji1.setTunjangan(1500000);   // Tunjangan: 1.500.000
        gaji1.setPajak(10);            // Pajak: 10%

        // Mencetak Gaji Bersih
        gaji1.cetakGajiBersih();
    }
}