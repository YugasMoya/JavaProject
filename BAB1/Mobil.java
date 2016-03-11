import java.util.Scanner;
public class Mobil {
    Scanner in = new Scanner(System.in);
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;
    private double rubahSekon;
    private double rubahKecepatan;
    private double hitungJarak;
    public void setNoPlat(String s) {
        noPlat = s;
        System.out.print("Masukkan nomor plat \t\t: ");
        noPlat = in.nextLine();
    }
    public void setWarna(String s) {
        warna = s;
        System.out.print("Masukkan warna mobil \t\t: ");
        warna = in.next();
    }
    public void setManufaktur(String s) {
        in.nextLine();
        manufaktur = s;
        System.out.print("Masukkan merek mobil \t\t: ");
        manufaktur = in.nextLine();
    }
    public void setKecepatan(int i) {
        kecepatan  = i;
        System.out.print("Masukkan kecepatan \t\t: ");
        kecepatan = in.nextInt();
        rubahKecepatan();
    }
    private void rubahSekon(double rubahSekon) {
        this.rubahSekon = rubahSekon;
        this.rubahSekon = this.waktu * 3600;
    }
    public void setWaktu(double waktu) {
        this.waktu = waktu;
        System.out.print("Masukkan waktu dalam satuan jam : ");
        this.waktu = in.nextDouble();
        rubahSekon(rubahSekon);
    }
    private void rubahKecepatan() {
        rubahKecepatan = kecepatan * 1000 / 3600;
    }
    public void hitungJarak() {
        hitungJarak = rubahKecepatan * rubahSekon;
    }
public void displayMessage(){
        System.out.println("Mobil anda adalah bermerek "+manufaktur);
        System.out.println("mempunyai nomor plat "+noPlat);
        System.out.println("serta memililki warna "+warna);
        System.out.println("dan mampu menempuh kecepatan "+kecepatan + 
                " km/jam" + " atau " + rubahKecepatan + " m/s");
        System.out.println("dalam waktu " + waktu + " jam" + " atau " 
                + this.rubahSekon + " detik");
    }
} 


