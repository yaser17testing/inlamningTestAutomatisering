import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class MorseManagerTest {


    @Test
    public void testingenlishtomorse() {
        MorseManager morse = new MorseManager();
        morse.mapMorseCode();
        String result = morse.englishToMorse("hej");
        assertEquals("......---", result);
    }





    @Test
    public void testEnglishUnknownLetter() {
        MorseManager morse = new MorseManager();
        try {
            morse.englishToMorse("å");
            fail();
        } catch (IllegalArgumentException e) {

            assertEquals("unknown letter", e.getMessage());

        }
    }

    @Test
    public void testMorseUnknownletter() {

        MorseManager morse = new MorseManager();
        try {
            morse.morseToEnglish("a");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals(" unknown letter", e.getMessage());


        }
    }





    }








