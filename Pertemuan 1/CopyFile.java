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
public class CopyFile {

    /**
     * @param args argumen baris perintah
     */
    public static void main(String args[]) throws IOException {
        // Logika aplikasi kode TODO di sini
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int c;
            while ((c = in.read()) != -1) {
               out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }      
    }
}
