package Opdracht2B;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class VoetbalclubTest {
    private Voetbalclub v1;
    private Voetbalclub v2;

    @BeforeEach
    public void init(){
        v1 = new Voetbalclub("");
        v2 = new Voetbalclub("Feyenoord");
    }


    @Test
    @DisplayName("Testing string replacement on empty string")
    void checkEmptyNaam(){
        System.out.println("checkEmptyName");
        assertEquals("FC", v1.getNaam(), "Actual expected to be: FC");
        System.out.println("checkEmptyName passed");
    }


    @Test
    @DisplayName("Testing string replacement on given string")
    void checkName(){
        System.out.println("checkName");
        assertEquals("Feyenoord", v2.getNaam(), "Actual expected to be naamconstr of Class Voetbalclub");
        System.out.println("checkName passed");
    }

    @Test
    @DisplayName("Testing win counter")
    void checkWinCount(){
        System.out.println("checkWinCount");
        v1.verwerkResultaat('w');
        assertEquals(3, v1.aantalPunten());
        assertEquals(1, v1.aantalGespeeld());
        System.out.println("checkWinCount passed");
    }

    @Test
    @DisplayName("Testing tie counter")
    void checkTieCount(){
        System.out.println("checkTieCount");
        v1.verwerkResultaat('g');
        assertEquals(1, v1.aantalPunten());
        assertEquals(1, v1.aantalGespeeld());
        System.out.println("checkTieCount passed");

    }

    @Test
    @DisplayName("Testing lose counter")
    void checkLoseCount(){
        System.out.println("checkLoseCount");
        v1.verwerkResultaat('v');
        assertEquals(0, v1.aantalPunten());
        assertEquals(1, v1.aantalGespeeld());
        System.out.println("checkLoseCount passed");

    }

    @Test
    @DisplayName("Testing wrong input in counter")
    void checkWrongInputCount(){
        System.out.println("checkLoseCount");
        v1.verwerkResultaat('a');
        assertEquals(0, v1.aantalPunten());
        assertEquals(0, v1.aantalGespeeld(), "Expected 0 in getAantalGespeeld");
        System.out.println("checkWrongInputCount passed");
    }

    @Test
    @DisplayName("Testing right amount of played matches in toString()")
    void checkAmountInString(){
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('g');
        v1.verwerkResultaat('v');
        v1.verwerkResultaat('v');
        assertEquals(7, v1.aantalPunten());
    }


}