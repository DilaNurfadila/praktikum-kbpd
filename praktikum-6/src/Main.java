/*
Nama : Nurfadila
NPM : 41155050220032
*/
import java.util.ArrayList; // import ArrayList
import java.util.Scanner; // import Scanner

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nilai = new ArrayList<Integer>(); // Membuat ArrayList
        Scanner scan = new Scanner(System.in); // Membuat Scanner
        for (int i = 0; i < 5; i++) { // Pengulangan untuk input nilai
            System.out.print("Masukan nilai ke-"+i+": ");
            nilai.add(scan.nextInt()); // Input nilai
        }

//        int i = 0; // Inisialisasi untuk menampilkan
//        while (i < 5) {
//            for (int j : nilai) { // Menampilkan array yang sudah di-input sebanyak 5 kali
//                System.out.println("Nilai ke-"+i+" = "+j); // Menampilkan isi array
//                i++; // Menjumlahkan dengan 1 nilai i yang sudah diberi inisialisasi
//            }
//        }
        for(int i : nilai) {
            System.out.print(i+" ");
        }
    }
}

