package Final_BangunRuang;

public class Limas {
    private double alas;
    private double tinggi_alas;
    private double tinggi_limas;
    private double luas;
    private double volume;

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi_alas() {
        return tinggi_alas;
    }

    public void setTinggi_alas(double tinggi_alas) {
        this.tinggi_alas = tinggi_alas;
    }

    public double getTinggi_limas() {
        return tinggi_limas;
    }

    public void setTinggi_limas(double tinggi_limas) {
        this.tinggi_limas = tinggi_limas;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas() {
        this.luas = (alas * tinggi_alas / 2) + 3 * (alas * tinggi_limas / 2);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume() {
        this.volume = (alas * tinggi_alas / 2) * tinggi_limas / 3;
    }
}
