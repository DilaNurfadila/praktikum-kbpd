import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int nilai;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukan nilai : ");
        nilai = scan.nextInt();

        if (nilai >= 90) {
            System.out.println("Predikat : A");
        } else if (nilai >= 80) {
            System.out.println("Predikat : B");
        } else if (nilai >= 60) {
            System.out.println("Predikat : C");
        } else if (nilai >= 40) {
            System.out.println("Predikat : D");
        } else {
            System.out.println("Predikat : E");
        }
    }
}