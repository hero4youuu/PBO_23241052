import java.util.ArrayList;

class player{
    // variabel objek
    private String nama;
    // variabel static
    private static int numberOfPlayer;
    //array variabel
    private static ArrayList<String> namakist = new ArrayList<String>();

    // konsustor
    player(String nama) {
        this.nama = nama;
        player.numberOfPlayer++;
        player.namakist.add(this.nama);
    
    }

    // method static cetak numberOfplayer
    static void showNumberOfPlayer(){
        System.out.println("number pf Player : " + player.numberOfPlayer);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // membuat objek
        player Player1 = new player ("rere");
        player player2 = new player("ucok");
        player player3 = new player("rangga");
        player player4 = new player("manadi");
        player player5 = new player("adam");



    }
}
