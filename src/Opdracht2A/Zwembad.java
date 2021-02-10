package Opdracht2A;

public class Zwembad{
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(double breedte,double lengte,double diepte){
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }
    public Zwembad(){

    }

    public double getBreedte(){
        return breedte;
    }

    public double getLengte(){
        return lengte;
    }

    public double getDiepte(){
        return diepte;
    }

    public double inhoud(){
        return lengte * breedte * diepte;
    }

    public void setBreedte(double nieuweBreedte){
        breedte = nieuweBreedte;
    }

    public void setLengte(double nieuweLengte){
        lengte = nieuweLengte;
    }

    public void setDiepte(double nieuweDiepte){
        diepte  = nieuweDiepte;
    }

    public String toString(){
        return "Dit zwembad is " + breedte + " breed, "+ lengte + " meter lang, en " + diepte + " meter diep";
    }

}
