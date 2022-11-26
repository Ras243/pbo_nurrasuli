package luas_bangun_datar;

public class Segitiga {
    private int alas;
    private int tinggi;
    private int luas;

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getLuas() {
        return luas;
    }

    public void setLuas() {
        this.luas = alas * tinggi / 2;
    }
}
