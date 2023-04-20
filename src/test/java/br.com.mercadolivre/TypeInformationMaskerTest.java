package br.com.mercadolivre;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TypeInformationMaskerTest {

    @Test
    public void testMask() {
        TypeInformatioMasker typeInformatioMasker = new TypeInformatioMasker();

        assertEquals("12345-678", typeInformatioMasker.mask("12345678"));
        assertEquals("12345-6789", typeInformatioMasker.mask("123456789"));
        assertEquals("123.456.789-01", typeInformatioMasker.mask("12345678901"));
        assertEquals("12.345.678/9012-34", typeInformatioMasker.mask("12345678901234"));

        assertEquals("1234567", typeInformatioMasker.mask("1234567"));
        assertEquals("1234567890", typeInformatioMasker.mask("1234567890"));
        assertEquals("123456789012", typeInformatioMasker.mask("123456789012"));
        assertEquals("1234567890123", typeInformatioMasker.mask("1234567890123"));
    }
}
