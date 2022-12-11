package Final_BangunRuang;

public class Tabung {
    private double jari;
    private double tinggi;
    private double luas;
    private double volume;

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas() {
        this.luas = (2 * Math.PI * jari * jari) + (2 * Math.PI * jari * tinggi);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume() {
        this.volume = Math.PI * jari * jari * tinggi;
    }
}
