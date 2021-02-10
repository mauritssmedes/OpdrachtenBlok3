package Opdracht2B;

public class main {
    public static void main(String[] args) {
        Voetbalclub ajx = new Voetbalclub("Ajax      ");
        Voetbalclub feij = new Voetbalclub("Feijenoord");

        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');

        System.out.println("Feijenoord punten: " + feij.aantalPunten());
        System.out.println("Ajax gespeeld: " + ajx.getAantalGespeeld());
        System.out.println();

        System.out.println(ajx);
        System.out.println(feij);
    }
}

class Voetbalclub{
    private String naam;
    private int aantalGewonnen;
    private int aantalVerloren;
    private int aantalGelijk;
    private int aantalGespeeld;

    public Voetbalclub(String naamconstr){
        this.naam = naamconstr;
    }
    
    public String getNaam() {
        return naam;
    }

    public int getAantalGewonnen() {
        return aantalGewonnen;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
        aantalGespeeld += 1;
    }
    public int getAantalGespeeld(){
        return aantalGespeeld;
    }
    public int aantalPunten(){
        return aantalGewonnen * 3 + aantalGelijk;
    }
    public String toString(){
        return naam + " " + aantalGespeeld + " " + aantalGewonnen + " " + aantalGelijk +
                " " + aantalVerloren + " " + aantalPunten();
    }
}
