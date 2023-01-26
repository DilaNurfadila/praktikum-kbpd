// Meng-import Scanner ke program
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Deklarasi variable
        String nama, alamat, ttl;
        int usia;
        float na;

        // Membuat Scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("Pendataan Karyawan");
        System.out.println("Nama Karyawan : ");
        nama = keyboard.nextLine(); // Input string
        System.out.println("Tanggal lahir : ");
        ttl = keyboard.nextLine();
        System.out.println("Alamat : ");
        alamat = keyboard.nextLine();
        System.out.println("Usia : ");
        usia = keyboard.nextInt(); // Input integer
        System.out.println("Nilai Akhir : ");
        na = keyboard.nextFloat();

        // Menampilkan hasil input
        System.out.println("Nama Karyawan : "+nama);
        System.out.println("Tanggal Lahir : "+ttl);
        System.out.println("Usia : "+usia+" tahun");
        System.out.println("Alamat : "+alamat);
        System.out.println("Nilai Akhir : "+na);
    }
}