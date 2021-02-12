package Opdracht3B;

public class Cirkel {
    private int radius;
    private int xpositie;
    private int ypositie;
    public Cirkel(int radius,int x,int y){
        this.radius = radius;
        this.xpositie = x;
        this.ypositie = y;
        if (radius <= 0){
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }
    }

    public String toString(){
        return "Cirkel ("+xpositie+","+ypositie+") met radius "+ radius;
    }
}
