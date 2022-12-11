package Final_BangunRuang;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main ruang = new Main();
        ruang.menu();
    }

    public void menu() {

        System.out.println("======| Bangun Ruang |======");
        System.out.println("\t[1] Kubus");
        System.out.println("\t[2] Tabung");
        System.out.println("\t[3] Limas Segitiga");
        System.out.println("\t[4] Keluar");
        System.out.println("======|--------------------|======");

        System.out.print("Pilihan : ");
        int pilihan = sc.nextInt();
        switch (pilihan) {
            case 1:
                fungsi_kubus();
                break;
            case 2:
                fungsi_tabung();
                break;
            case 3:
                fungsi_limas();
                break;
            case 4:
                keluar();
                break;
            default:
                System.out.println("Maaf yang anda inputkan salah");
                break;
        }
    }
    public void hitungLagi() {
        System.out.print("Hitung Lagi ? [Y/N] : ");
        String trans = sc.next();
        if (trans.equalsIgnoreCase("Y")) {
            menu();
        } else if (trans.equalsIgnoreCase("N")) {
            keluar();
        } else {
            // Fungsi Rekursif | Memangil Fungsi ini trus menerus
            System.out.println("Maaf, Yang Anda inputkan salah");
            hitungLagi();
        }
    }

    public void keluar() {
        System.out.println();
        System.out.println("\tTerimakasih telah menggunakan Program Kami.");

    }
    

    // fungsi kubus
    public void fungsi_kubus() {
        double sisi;

        System.out.println("Menghitung Luas dan Volume Kubus");
        System.out.print("Input sisi Kubus : ");
        sisi = sc.nextDouble();

        Kubus kubus = new Kubus();
        kubus.setSisi(sisi);
        kubus.setLuas();
        kubus.setVolume();

        System.out.println("sisi : " + kubus.getSisi());
        System.out.println("Luas Kubus : " + kubus.getLuas());
        System.out.println("Volume Kubus : " + kubus.getVolume());
        hitungLagi();
    }

    // fungsi tabung
    public void fungsi_tabung() {
        double jari;
        double tinggi;
        
        System.out.println("Menghitung Luas dan Volume Tabung");
        System.out.print("Input jari-jari tabung : ");
        jari = sc.nextDouble();
        System.out.print("Input tinggi tabung : ");
        tinggi = sc.nextDouble();

        Tabung tabung = new Tabung();
        tabung.setJari(jari);
        tabung.setTinggi(tinggi);
        tabung.setLuas();
        tabung.setVolume();

        System.out.println("jari-jari : " + tabung.getJari());
        System.out.println("Luas Tabung : " + tabung.getLuas());
        System.out.println("Volume Tabung : " + tabung.getVolume());
        hitungLagi();
    }
    
    // fungsi tabung
    public void fungsi_limas() {
        double alas;
        double tinggi_alas;
        double tinggi_limas;
        System.out.println("Menghitung Luas dan Volume Limas Segitiga");
        System.out.print("Input alas : ");
        alas = sc.nextDouble();
        System.out.print("Input tinggi alas limas : ");
        tinggi_alas = sc.nextDouble();
        System.out.print("Input tinggi limas : ");
        tinggi_limas = sc.nextDouble();

        Limas limas = new Limas();
        limas.setAlas(alas);
        limas.setTinggi_alas(tinggi_alas);
        limas.setTinggi_limas(tinggi_limas);
        limas.setLuas();
        limas.setVolume();

        System.out.println("alas : " + limas.getAlas());
        System.out.println("tinggi alas : " + limas.getTinggi_alas());
        System.out.println("tinggi limas : " + limas.getTinggi_limas());
        System.out.println("Luas Permukaan Limas : " + limas.getLuas());
        System.out.println("Volume Limas : " + limas.getVolume());
        hitungLagi();
    }
}