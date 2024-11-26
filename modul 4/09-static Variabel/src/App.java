class Display{
    // variabel objek / Data member
    private String nama;
    // variabel 
    static String tipe = "Display";

    //konsutor
    Display (String nama) {
        this.nama = nama;

    }
    //method cetak
    void cetak(){
        System.out.println("Display : " + this.nama );
    }

    // method setter
    void setTipe(String tipeinput) {
        // tipe = tipeinput; // cara 1
        // this.tipe = tipeinput; // cara 2 
        Display.tipe = tipeinput; // cara 3
    }

}
public class App {
    public static void main(String[] args) throws Exception {
        // instantansi
        Display display1 = new Display("monitor");
        display1.cetak();
        Display display2 = new Display("smartphone");
        display2.cetak();

        // menampilkan isi dari static variabel
        System.out.println("/menampikan static variabel");
        System.out.println("objek :" + display1.tipe);
        System.out.println("objek :" + display2.tipe);
        System.out.println("class : " + Display.tipe);

        // Menulis ulang isi variabel 
        //display1.tipe = "Tampilan";
        //display2.tipe = "taampilan";
        Display.tipe = "tampilan";

        // menggunkan setter 
        display1.setTipe("Sepanduk");

        //mengamil isi variabel static
        System.out.println("/menampikan static variabel");
        System.out.println("objek :" + display1.tipe);
        System.out.println("objek :" + display2.tipe);
        System.out.println("class : " + Display.tipe);



    }
}