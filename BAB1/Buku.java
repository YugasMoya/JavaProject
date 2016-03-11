package Praktikum_Pemlan_Semester2.BAB1;
import java.util.Scanner;
public class Buku {
    Scanner in = new Scanner(System.in);
        private double halaman1 = 0.5;
        private double kata1 = 100;
        private double hari;
           
        public Buku (double halaman2, double kata2) {
            kata2 = (kata1 / halaman1) * halaman2;
            System.out.println("1 Buku = 50 Lembar");
            System.out.println("50 Lembar = 100 Halaman");
            System.out.println("1 Hari dapat menulis 100 kata");
            System.out.println("100 kata dapat memenuhi 1/2 halaman buku");
            System.out.println("1 Hari = 100 kata = 1/2 halaman");
            System.out.println("? Hari = ? kata = 100 Halaman");
            System.out.println("100 halaman dapat di tulis dengan " + kata2 + " kata");
            hari = kata2 / kata1;
            System.out.println("Sehingga hari yang di butuhkan untuk menghabiskan "
                    + "buku tersebut  adalah : " + hari + " Hari");
        }
}
