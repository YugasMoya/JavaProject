package Praktikum_Pemlan_Semester2.BAB1;
import java.util.Scanner;
public class asu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double halaman1 = 0.5;
        double kata1 = 100;
        System.out.print("Masukkan jumlah halaman : ");
        double halaman2 = in.nextInt();
        double kata2;
        kata2 = (kata1 / halaman1) * halaman2;
        System.out.println("100 halaman = " + kata2);
        double hari2 = kata2 / kata1;
        System.out.println("Hari yang di butuhkan untuk membaca adalah : " + hari2 + " Hari");
    }
}
