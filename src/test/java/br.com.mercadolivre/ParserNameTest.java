package br.com.mercadolivre;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ParserNameTest {

    @Test
    public void testValidNames() {
        ParserName nameParser = new ParserName();

        Name name1 = nameParser.parse("Jose Silva");
        assertEquals(name1.getFirstName(), "Jose");
        assertEquals(name1.getLastName(), "Silva");

        Name name2 = nameParser.parse("Maria de Souza");
        assertEquals(name2.getFirstName(), "Maria");
        assertEquals(name2.getLastName(), "de Souza");
    }

    @Test
    public void testInvalidNames() {
        ParserName nameParser = new ParserName();
        assertThrows(IllegalArgumentException.class, () -> nameParser.parse("Joao"));
    }
}
