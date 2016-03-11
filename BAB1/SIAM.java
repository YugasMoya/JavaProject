package Praktikum_Pemlan_Semester2.BAB1;
import java.util.Scanner;
public class SIAM {
    Scanner in = new Scanner(System.in);
    private String nama;
    private String nim;
    private String jurusan;
    private String KRS;
    public SIAM() {
    }
    public SIAM(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }
    public void setnama(String nama) {
        this.nama = nama;
    }
    public void setnim(String nim) {
        this.nim = nim;
    }
    public void setjurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    public void setKRS(String KRS) {
        this.KRS = KRS;
    }
    public String getKRS() {
        double ip;
        int i = 0;
        int total_sks = 0;
        String krsSmt[][] = new String[10][3];
        System.out.print("IP \t\t: ");
        ip = in.nextDouble();
        int krs_bawah = 0;
        int krs_atas = 0;
        if (ip >= 3.00) {
            krs_bawah = 22;
            krs_atas = 24;
        } else if (ip >= 2.50) {
            krs_bawah = 19;
            krs_atas = 21;
        } else if (ip >= 2.00) {
            krs_bawah = 16;
            krs_atas = 18;
        } else if (ip >= 1.50) {
            krs_bawah = 12;
            krs_atas = 15;
        } else {
            krs_bawah = 0;
            krs_atas = 11;
        }
        System.out.println("Sks yang dapat di ambil " + krs_bawah + "-" + krs_atas);
        System.out.println("DAFTAR MATA KULIAH SEMESTER INI");
        System.out.println("NO \t KODE \t\t Mata Kuliah \t\t\t SKS");
        System.out.println("1. \t PTI15007 \t Sistem Basis Data \t\t 4");
        System.out.println("2. \t PTI15008 \t Sistem Operasi \t\t 4");
        System.out.println("3. \t PTI15005 \t Interaksi Manusia & Komputer \t 3");
        System.out.println("4. \t PTI15003 \t Algoritma & Struktur Data \t 5");
        System.out.println("5. \t IFK15101 \t Pemodelan Berorientasi Object \t 3");
        System.out.println("6. \t UBU40050 \t Kewirausahaan \t\t\t 3");
        System.out.println("7. \t UNG40010 \t Agama \t\t\t\t 3");
        System.out.println("8. \t IFK15202 \t Desain & Analisis Algoritma \t 3");
        System.out.println("9. \t IFK15201 \t Analisis & Perancangan Sistem \t 3");
        String kd_mk, nama_mk;
        int krs_sks;
        for (;;) {
            in.nextLine();
            System.out.println();
            System.out.println("Tekan (0) Untuk berhenti mengisi KRS");
            System.out.print("Kode Mata Kuliah: ");
            kd_mk = in.nextLine();
            System.out.print("Mata Kuliah \t: ");
            nama_mk = in.nextLine();
            System.out.print("SKS \t\t: ");
            krs_sks = in.nextInt();
            if (kd_mk.equalsIgnoreCase("0") || nama_mk.equalsIgnoreCase("0") || krs_sks == 0) {
                if (total_sks < krs_bawah) {
                    System.out.println("KRS Masih Kurang!");
                } else {
                    break;
                }
            } else {}
            if ((total_sks + krs_sks) < krs_atas) {
                krsSmt[i][0] = kd_mk;
                krsSmt[i][1] = nama_mk;
                krsSmt[i][2] = String.valueOf(krs_sks);
                total_sks += krs_sks;
                i += 1;
            } else if ((total_sks + krs_sks) == 24 || (total_sks + krs_sks) == 21 || (total_sks + krs_sks) == 18 || (total_sks + krs_sks) == 15 || (total_sks + krs_sks) == 11) {
                System.out.println();
                krsSmt[i][0] = kd_mk;
                krsSmt[i][1] = nama_mk;
                krsSmt[i][2] = String.valueOf(krs_sks);
                total_sks += krs_sks;
                i += 1;
                break;
            } else {
                System.out.println("KRS Melebihi Batas!");
                break;
            }
        }
        System.out.println("\t\t\t\t\t\t KARTU RENCANA STUDI \n");
        System.out.println("No Induk \t: " + nim + " \t\t\t\t\t\t Th. Akademik \t: 2015/2016");
        System.out.println("Nama \t\t: " + nama + " \t\t\t\t\t\t Semester \t: Genap");
        System.out.println("Program Studi \t: " + jurusan);
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println("NO \t KODE \t\t\t\t NAMA MATA KULIAH \t\t\t SKS \t\t KETERANGAN");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        int mk = 0;
        for (int k = 0; k < krsSmt.length; k++) {
            if (krsSmt[k][0] == null) {
                break;
            } else {}
            System.out.println(k + 1 + "\t" + krsSmt[k][0] + "\t\t\t" + krsSmt[k][1] + "\t\t" + krsSmt[k][2]);
            mk = k+1;
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t Jumlah : " + total_sks);
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println("Catatan Akademik Semester Lalu");
        System.out.println("Semester     MK Lulus     = " + mk + "\t      SKS Lulus     = " + total_sks + "      \t IP Lulus     = " + ip);
        System.out.println("             MK Beban     = " + mk + "\t      SKS Beban     = " + total_sks + "      \t IP Beban     = " + ip + "\n");
        System.out.println("Catatan Dosen Penasehat Akademik \t\t\t\t\t\t\t\t Malang, 9 Maret 2016");
        System.out.println("......................................... \t\t\t\t\t\t\t Menyetujui,");
        System.out.println("......................................... \t\t\t\t\t\t\t Dosen Penasehat Akademik");
        System.out.println(".........................................");
        System.out.println(".........................................");
        System.out.println(".........................................");
        System.out.println(".........................................");
        System.out.println("......................................... \t\t\t\t\t\t\t Mahendra Data, S.Kom");
        System.out.println("......................................... \t\t\t\t\t\t\t ---------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t NIP. 86111706110258");
        return KRS;
    }
}