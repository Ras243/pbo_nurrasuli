package luas_bangun_datar;
import java.util.Scanner;

public class TestBangunDatar {
    private static final Scanner sc = new Scanner(System.in);
    
    public static void luasPersegi(){
        int sisi;
     
        System.out.println("Menghitung Luas Persegi");
        System.out.print("Input sisi Persegi : ");
        sisi = sc.nextInt();
        
        Persegi persegi = new Persegi();
        persegi.setSisi(sisi);
        persegi.setLuas();
        
        System.out.println("sisi : " + persegi.getSisi());
        System.out.println("Luas Persegi : " + persegi.getLuas());
    }
    public static void luasSegitiga(){
        int alas, tinggi;
        
        System.out.println("Menghitung Luas Segitiga");
        System.out.print("input panjang alas Segitiga : ");
        alas = sc.nextInt();
        System.out.print("input tinggi Segitiga : ");
        tinggi = sc.nextInt();
        
        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(alas);
        segitiga.setTinggi(tinggi);
        segitiga.setLuas();
        
        System.out.println("alas Segitiga : " + segitiga.getAlas());
        System.out.println("tinggi Segitiga : " + segitiga.getTinggi());
        System.out.println("Luas Segitiga : " + segitiga.getLuas());
    }
    
    public static void luasLingkaran(){
        double diameter;
        
        System.out.println("Menghitung Luas Lingkaran");
        System.out.println("input diameter Lingkaran : ");
        diameter = sc.nextDouble();
        
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setDiameter(diameter);
        lingkaran.setPhi();
        lingkaran.setR();
        lingkaran.setLuas();
        
        System.out.println("diameter lingkaran : " + lingkaran.getDiameter());
        System.out.println("phi : " + lingkaran.getPhi());
        System.out.println("jari-jari lingkaran : " + lingkaran.getR());
        System.out.println("Luas lingkaran : " + lingkaran.getLuas());
    } 
}
