package Praktikum_Pemlan_Semester2.BAB1;
import java.util.Scanner;
public class MainSIAM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = null;
        do {
            System.out.print("NAMA \t\t: ");
            String a = in.nextLine();
            System.out.print("NIM \t\t: ");
            String b = in.nextLine();
            System.out.print("Jurusan \t: ");
            String c = in.nextLine();
            SIAM mhs = new SIAM(a,b,c);
            String KRS = mhs.getKRS();
            System.out.print("Ingin Mengulang Lagi ? (Y)/(T)");
            x = in.nextLine();
            System.out.println();
        } while (x.equalsIgnoreCase("Y"));
    }
}