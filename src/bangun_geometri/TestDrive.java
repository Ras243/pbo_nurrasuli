package bangun_geometri;

import java.util.Scanner;

class TestDrive {

    private static Scanner s = new Scanner(System.in);

    public static void balokTestDrive() {
        int p, l, t;
        Balok B = new Balok();
        System.out.println("Bangun Balok");
        System.out.println("Masukkan panjang balok :");
        p = s.nextInt();
        System.out.println("Masukkan lebar balok: ");
        l = s.nextInt();
        System.out.println("Masukkan tinggi balok : ");
        t = s.nextInt();
        B.setPanjang(p);
        B.setLebar(l);
        B.setTinggi(t);
        B.setVolume();
        B.setLuasPermukaan();
        System.out.println("Panjang balok = " + B.getPanjang());
        System.out.println("Lebar balok = " + B.getLebar());
        System.out.println("Tinggi balok = " + B.getTinggi());
        System.out.println("Volume balok = " + B.getVolume());
        System.out.println("Luas permukaan balok = " + B.getLuasPermukaan());
    }

    public static void tabungTestDrive() {
        Tabung T = new Tabung();
        int jarijari, t;
        System.out.println("Bangun Tabung");
        System.out.println("Masukkan panjang jari jari :");
        jarijari = s.nextInt();
        System.out.println("Masukkan tinggi: ");
        t = s.nextInt();
        T.setJariJari(jarijari);
        T.setTinggi(t);
        T.setVolume();
        T.setLuasPermukaan();
        System.out.println("Jarijari tabung = " + T.getJariJari());
        System.out.println("Tinggi tabung = " + T.getTinggi());
        System.out.println("Volume tabung = " + T.df.format(T.getVolume()));
        System.out.println("Luas permukaan tabung = " + T.df.format(T.getLuasPermukaan()));
    }

//    public static void belahKetupatTestDrive() {
//        System.out.println("Bangun Belah Ketupat");
//        BelahKetupat B = new BelahKetupat();
//        int sisi, d1;
//        System.out.println("Masukkan panjang sisi :");
//        sisi = s.nextInt();
//        System.out.println("Masukkan panjang diagonal satu: ");
//        d1 = s.nextInt();
//        B.setSisi(sisi);
//        B.setDiagonalSatu(d1);
//        B.setDiagonalDua();
//        B.setLuas();
//        B.setKeliling();
//        System.out.println("Sisi Belah Ketupat = " + B.getSisi());
//        System.out.println("Diagonal1 Belah ketupat = " + B.getDiagonalSatu());
//
//        System.out.println("Diagonal2 Belah Ketupat = " + B.df.format(B.getDiagonalDua()));
//
//        System.out.println("Luas Belah Ketupat = " + B.df.format(B.getLuas()));
//
//        System.out.println("Keliling Belah Ketupat = " + B.getKeliling());
//    }
//
//    public static void kubusTestDrive() {
//        Kubus K = new Kubus();
//        int sisi;
//        System.out.println("Bangun Kubus");
//        System.out.println("Masukkan panjang sisi :");
//        sisi = s.nextInt();
//        K.setSisi(sisi);
//        K.setVolume();
//        K.setLuasPermukaan();
//        System.out.println("Panjang sisi kubus = " + K.getSisi());
//        System.out.println("Volume kubus = " + K.getVolume());
//        System.out.println("Luas permukaan kubus = " + K.getLuasPermukaan());
//    }
//
//    public static void lingkaranTestDrive() {
//        System.out.println("Bangun Lingkaran");
//        Lingkaran L = new Lingkaran();
//        int jarijari;
//        System.out.println("Masukkan panjang jari jari :");
//        jarijari = s.nextInt();
//        L.setJariJari(jarijari);
//        L.setDiameter();
//        L.setLuas();
//        L.setKeliling();
//        System.out.println("Jari-jari lingkaran = " + L.getJariJari());
//        System.out.println("Diameter lingkaran = " + L.getDiameter());
//        System.out.println("Luas lingkaran = " + L.df.format(L.getLuas()));
//        System.out.println("Keliling lingkaran = " + L.df.format(L.getKeliling()));
//    }
//
//    public static void segiEmpatTestDrive() {
//        SegiEmpat S = new SegiEmpat();
//        int p, l;
//        System.out.println("Bangun Segi Empat");
//        System.out.println("Masukkan panjang :");
//        p = s.nextInt();
//        System.out.println("Masukkan lebar: ");
//        l = s.nextInt();
//        S.setPanjang(p);
//        S.setLebar(l);
//        S.setLuas();
//        S.setKeliling();
//        System.out.println("Panjang Segi Empat = " + S.getPanjang());
//        System.out.println("Lebar Segi Empat = " + S.getLebar());
//        System.out.println("Luas Segi Empat = " + S.getLuas());
//        System.out.println("Keliling Segi Empat = " + S.getKeliling());
//    }
//
//    public static void segitigaSikuSikuTestDrive() {
//        System.out.println("Bangun Segitiga Siku Siku");
//        SegiTigaSikuSiku S = new SegiTigaSikuSiku();
//        int a, t;
//        System.out.println("Masukkan alas :");
//        a = s.nextInt();
//        System.out.println("Masukkan tinggi: ");
//        t = s.nextInt();
//        S.setAlas(a);
//        S.setTinggi(t);
//        S.setMiring();
//        S.setLuas();
//        S.setKeliling();
//        System.out.println("Alas Segitiga = " + S.getAlas());
//        System.out.println("Tinggi Segitiga = " + S.getTinggi());
//
//        System.out.println("Luas Segitiga Siku-Siku = " + S.getLuas());
//
//        System.out.println("Sisi miring Segitiga = " + S.getMiring());
//
//        System.out.println("Keliling Segitiga Siku Siku = " + S.getKeliling());
//    }
}
