import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NutricionistaTest {

    @Test
    void deveRetornarAlimentoDieta() {
        Nutricionista nutricionista = new Nutricionista();
        nutricionista.setDieta("Batata doce e frango");

        assertEquals("Batata doce e frango", nutricionista.getDieta());
    }

    @Test
    void deveRetornarCalorias() {
        Nutricionista nutricionista = new Nutricionista();
        nutricionista.setDieta("Tapioca com carne bovina");

        assertEquals(610.0f, nutricionista.getCalorias());
    }
}