package Praktikum_Pemlan_Semester2.BAB1;

import java.util.Scanner;

public class NewClass {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sks;
        double ip = 3.1;
        if (ip >= 3) {
            System.out.println("Sks yang dapat di tempuh adalah 22-24 sks, pilih berapa sks yang anda pilih ?");
            sks = in.nextInt();
            if (sks == 22) {
                for (sks = 22; sks >= 0; sks -= 3) {
                    System.out.println("Masukkan matkulnya");
                }
            }
        }
    }
}
