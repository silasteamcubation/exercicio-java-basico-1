package br.com.mercadolivre;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TypeInformationCheckerTest {

    @Test
    public void testType() {
        TypeInformationChecker typeInformationChecker = new TypeInformationChecker();

        assertEquals("CEP", typeInformationChecker.getType("12345678"));
        assertEquals("TEL", typeInformationChecker.getType("123456789"));
        assertEquals("CPF", typeInformationChecker.getType("12345678901"));
        assertEquals("CNPJ", typeInformationChecker.getType("12345678901234"));

        assertEquals("ERRO", typeInformationChecker.getType("1234567"));
        assertEquals("ERRO", typeInformationChecker.getType("1234567890"));
        assertEquals("ERRO", typeInformationChecker.getType("123456789012"));
        assertEquals("ERRO", typeInformationChecker.getType("1234567890123"));
    }
}
