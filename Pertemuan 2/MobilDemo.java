/*
 * Untuk mengubah header lisensi ini, pilih License Headers di Project Properties.
 * Untuk mengubah file template ini, pilih Tools | Template
 * dan buka template di editor.
 */
package mobildemo;

public class MobilDemo {
    public static void main(String[] args) {
        Mobil2 myCar = new Mobil2();
        myCar.hidupkanMobil();
        myCar.ubahGigi(5);
        System.out.println("Mobil dalam kondisi menyala : " + myCar.active + " Gigi mobil sekarang " + myCar.gigi);
    }
}

class Mobil2 {
    boolean active = false;
    int gigi;

    Mobil2() {

    }

    public void hidupkanMobil() {
        active = true;
    }

    public void matikanMobil() {
        active = false;
    }

    public void ubahGigi(int newGigi) {
        if (active) {
            gigi = newGigi;
        }
    }
}