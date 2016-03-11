public class MainMobil {
    public static void main(String[] args) {
        //instan objek bernama m1
        Mobil m1 = new Mobil();
        m1.setKecepatan(0);
        m1.setManufaktur(null);
        m1.setNoPlat(null);
        m1.setWarna(null);
        m1.setWaktu(0);
        m1.displayMessage();
        System.out.println("================");
        //instan objek baru bernama m2
        Mobil m2 = new Mobil();
        m2.setKecepatan(0);
        m2.setManufaktur(null
                );
        m2.setNoPlat(null);
        m2.setWarna(null);
        m2.setWaktu(0);
        m2.displayMessage();
        System.out.println("================");
        //merubah warna dari objek m1
        System.out.println("mobil pada objek m1 di rubah menjadi warna hijau");
        m1.setWarna(null);
        //menampilkan hasil perubahan
        m1.displayMessage();
    }
}
