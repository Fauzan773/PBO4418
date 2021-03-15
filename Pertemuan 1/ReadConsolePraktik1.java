
import java.io.*;

/*
 * Untuk mengubah header lisensi ini, pilih License Headers di Project Properties.
 * Untuk mengubah file template ini, pilih Tools | Template
 * dan buka template di editor.
 */

/**
 *
 * @author Fauzan Maulana Alfany
 */
public class ReadConsolePraktik1 {
    /**
     * @param args argumen baris perintah
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws IOException {
        // Logika aplikasi kode TODO di sini
        InputStreamReader cin = null;
        
        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Enter characters, 'q' to quit.");
            char c;
            do {
                c = (char) cin.read();
                System.out.print(c);
            } while(c != 'q'); 
        }finally {
            if (cin != null) {
               cin.close();
            }
        }
    }
}
