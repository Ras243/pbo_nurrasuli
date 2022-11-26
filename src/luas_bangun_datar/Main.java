package luas_bangun_datar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Menu {

    public static void main(String[] args) {
        try {
            System.out.println("Pengolahan Bangun Geometri");
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(r);
            
            String pil;
            int p = 9;
            while (p != 0) {
                System.out.println("Menu");
                System.out.println("[1] Persegi");
                System.out.println("[2] Segitiga");
                System.out.println("[3] Lingkaran");

                System.out.print("Masukkan angka pilihan : ");
                pil = input.readLine();
                p = Integer.parseInt(pil);
                switch (p) {
                    case 1:
                       TestBangunDatar.luasPersegi();
                        break;
                    case 2:
                        TestBangunDatar.luasSegitiga();
                        break;
                    case 3:
                        TestBangunDatar.luasLingkaran();
                        break;
                    default:
                        System.out.println("Menu tidak ditemukan!");
                }
                System.out.println("Lanjut? (O = Tidak /1 = Iya)");
                pil = input.readLine();
                p = Integer.parseInt(pil);
            }
        } catch (IOException e) {
            System.out.println("Error tidak dikenali !");
        }
        System.out.println("program dikeluarkan !!");
    }

}
