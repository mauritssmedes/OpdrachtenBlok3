package Opdracht2A;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ZwembadTest {
    @Test
    public void testSetBreedte() {
        Zwembad zwembad1 = new Zwembad();
        zwembad1.setBreedte(50);
        assertEquals(50,zwembad1.getBreedte());
    }
}