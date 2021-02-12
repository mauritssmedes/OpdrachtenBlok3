package Opdracht2B;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalVerloren;
    private int aantalGelijk;

    public Voetbalclub(String naamconstr) {
        this.naam = naamconstr;
        if (naamconstr.equals("")){
            this.naam = "FC";
        }

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
    }

    public int aantalGespeeld() {
       return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public int aantalPunten() {
        return aantalGewonnen * 3 + aantalGelijk;
    }

    public String toString() {
        return naam + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk +
                " " + aantalVerloren + " " + aantalPunten();

    }
}