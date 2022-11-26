package bangun_geometri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Menu {

    public static void main(String[] args) {
        try {
            System.out.println("Pengolahan Bangun Geometri");
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(r);
            TestDrive test = new TestDrive();
            String pil;
            int p = 9;
            while (p != 0) {
                System.out.println("Menu");
                System.out.println("[1] Segitiga Siku-siku");
                System.out.println("[2] Lingkaran");
                System.out.println("[3] Belah Ketupat");
                System.out.println("[4] Segi Empat");
                System.out.println("[5] Tabung");
                System.out.println("[6] Kubus");
                System.out.println("[7] Balok");
                System.out.println("Masukkan angka pilihan");
                pil = input.readLine();
                p = Integer.parseInt(pil);
                switch (p) {
                    case 1:
                       // test.segitigaSikuSikuTestDrive();
                        break;
                    case 2:
                        //test.lingkaranTestDrive();
                        break;
                    case 3:
                        //test.belahKetupatTestDrive();
                        break;
                    case 4:
                      //  test.segiEmpatTestDrive();
                        break;
                    case 5:
                        test.tabungTestDrive();
                        break;
                    case 6:
                       // test.kubusTestDrive();
                        break;
                    case 7:
                        test.balokTestDrive();
                        break;
                }
                System.out.println("Lanjutgan?(O = keluar/1 = tidak)");
                pil = input.readLine();
                p = Integer.parseInt(pil);
            }
        } catch (IOException e) {
            System.out.println("Error tidak dikenali");
        }

    }

}
