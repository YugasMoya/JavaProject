package Praktikum_Pemlan_Semester2.BAB1;
public class Pola_SIAM {
    public static void main(String[] args) {
        SIAM mhs1 = new SIAM("Sunari Al Farizi", "155150201111363", "Teknik Informatika");
        System.out.println("\t\t\t\t\t\t KARTU RENCANA STUDI \n");
        System.out.println("No Induk \t: "+ mhs1.getNim() +" \t\t\t\t\t\t Th. Akademik \t: 2015/2016");
        System.out.println("Nama \t\t: " + mhs1.getNama() + " \t\t\t\t\t\t Semester \t: Genap");
        System.out.println("Program Studi \t: " + mhs1.getJurusan());
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println("NO \t KODE \t\t\t\t NAMA MATA KULIAH \t\t\t SKS \t\t KETERANGAN");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println("1 \t IFK15001 \t\t\t Matematika Komputasi Lanjut \t\t 4.00 ");
        System.out.println("2 \t IFK15002 \t\t\t Pemrograman Lanjut \t\t\t 5.00 ");
        System.out.println("3 \t KOM15003 \t\t\t Arsitektur dan Organisasi Komputer \t 3.00 ");
        System.out.println("4 \t PTI15006 \t\t\t Probabilitas & Statistika \t\t 4.00 ");
        System.out.println("5 \t UBU0008 \t\t\t Bahasa Ingrris \t\t\t 3.00 ");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t Jumlah : 19");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println("Catatan Akademik Semester Lalu");
        System.out.println("Semester     MK Lulus     = 5 \t      SKS Lulus     = 19      \t IP Lulus     = " + ip);
        System.out.println("             MK Beban     = 5 \t      SKS Beban     = 19      \t IP Beban     = " + ip + "\n");
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
    }
}
