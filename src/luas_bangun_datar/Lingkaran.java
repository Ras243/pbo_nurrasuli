package luas_bangun_datar;

public class Lingkaran {
    private double phi;
    private double diameter;
    private double r;
    private double luas;

    public double getPhi() {
        return phi;
    }

    public void setPhi() {
        this.phi = 3.14;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getR() {
        return r;
    }

    public void setR() {
        this.r = diameter / 2;
    }
    
    public void setLuas() {
        this.luas = phi * r * r;
    }
    
    public double getLuas() {
        return luas;
    }
    
}
