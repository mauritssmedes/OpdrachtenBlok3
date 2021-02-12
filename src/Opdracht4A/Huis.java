package Opdracht4A;

public class Huis {
    private String adres;
    private int bouwjaar;
    Persoon huisbaas = null;

    public Huis(String adres, int bouwjaar){
        this.adres = adres;
        this.bouwjaar = bouwjaar;
    }
    public void setHuisbaas(Persoon hb){
        this.huisbaas = hb;
    }
    public Persoon getHuisbaas(){
        return huisbaas;
    }
    public String toString(){
        return "Huis " + adres + " is gebouwd in " + bouwjaar + "\n" +
                "en heeft nu huisbaas " + getHuisbaas().toString();
    }
}
