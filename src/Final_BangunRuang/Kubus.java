package Final_BangunRuang;

public class Kubus {
    private double sisi;
    private double luas;
    private double volume;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas() {
        this.luas =  6 * (sisi * sisi);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume() {
        this.volume = sisi * sisi * sisi;
    }
}
