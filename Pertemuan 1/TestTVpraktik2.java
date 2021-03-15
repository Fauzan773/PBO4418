/*
 * Untuk mengubah header lisensi ini, pilih License Headers di Project Properties.
 * Untuk mengubah file template ini, pilih Tools | Template
 * dan buka template di editor.
 */

/**
 *
 * @author Fauzan Maulana Alfany
 */
public class TestTVpraktik2 {

  
//    @param berargumen argumen baris perintah
    int channel; 
//    buat variabel saluran
    int volumeLevel;
//    buat variabel volumeLevel
    boolean on;
//     make on variable
    
//  konstruksi objek
    TestTVpraktik2() { 
    } 
    
//    Kondisi TV Nyala
    void turnOn(boolean on) {
        on = true;
    }
//    Kondisi TV Mati
    void turnOff(boolean on) {
        on = false;
    }
//    indikator untuk mengatur Saluran
    void setChannel(int newChannel){
        channel = newChannel;
    }
//    indikator untuk mengatur Suara
    void setVolume(int newVolumeLevel){
        volumeLevel = newVolumeLevel;
    }
//      saluran sudah habis
    void channelUp() {
        ++channel ;
    }
//    saluran turun
    void channelDown() {
        --channel;
    }
//    volume naik
    void volumeUp() {
        ++volumeLevel;
    }
//    volume turun
    void volumeDown() {
        --volumeLevel ;
    }
   
    public static void main(String args[]) {
        // Logika aplikasi kode TODO di sini
        TestTVpraktik2 tv1 = new TestTVpraktik2();
        tv1.turnOn(true);
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        TestTVpraktik2 tv2 = new TestTVpraktik2();
        tv2.turnOn(true);
        tv2.channelUp();
        tv2.volumeUp();
        tv2.channelUp();
        tv2.volumeUp();
        tv2.channelUp();
        
        
        System.out.println("tv1's channel is " + tv1.channel + " and volume is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and volume is " + tv2.volumeLevel);
    }
}