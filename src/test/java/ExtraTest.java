import Week4_Build_Jacoco.Laskin;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ExtraTest extends AbstractParent {

    private static Laskin laskin;
    private final double DELTA = 0.001;

    @BeforeAll
    public static void setUp() {
        System.out.println("@BeforeAll Virta ON (ennen ensimmäistä testiä)");
        laskin = new Laskin();
        laskin.virtaON();
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("@AfterAll Virta OFF (kaikki testit ajettu).");
        laskin.virtaOFF();
        laskin = null;
    }

    @BeforeEach
    public void beforeEachTest() {
        System.out.println("  Nollaa laskin.");
        laskin.nollaa();
        assertEquals(0, laskin.annaTulos(), "Nollaus ei onnistunut");
    }

    @Test
    public void testNelio2() {
        laskin.nelio(2);
        assertEquals(4, laskin.annaTulos(), "Luvun 2 neliöön korotus väärin");
    }

    @Test
    public void testNelio4() {
        laskin.nelio(4);
        assertEquals(16, laskin.annaTulos(), "Luvun 4 neliöön korotus väärin");
    }

    @Test
    public void testNelio5() {
        laskin.nelio(5);
        assertEquals(25, laskin.annaTulos(), DELTA, "Luvun 5 neliöön korotus väärin");
    }

    @Test
    public void testNeliojuuri2() {
        laskin.neliojuuri(2);
        assertEquals((int) Math.sqrt(2), laskin.annaTulos(), DELTA, "Luvun 2 neliöjuuri väärin");
    }

    @Test
    @DisplayName("Testaa negatiivinen neliöjuuri")
    public void testNeliojuuriNegat() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            laskin.neliojuuri(-2);
        });

        String expectedMessage = "Negatiiviselle luvulle ei voi laskea neliöjuurta";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage), "Virheviesti ei vastaa odotettua viestiä");
    }

}
