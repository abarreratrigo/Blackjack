package test;
import static org.junit.jupiter.api.Assertions.*;

import modelo.Mazo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import excepciones.NoHayMasCartasException;

public class MazoTest {

    private Mazo mazo;

    @BeforeEach
    public void setup() {
        mazo = new Mazo();
    }

    @Test
    public void testBarajarNoModificaTamaño() {
        int tamañoAntes = mazo.cartas.size();
        mazo.barajar();
        int tamañoDespues = mazo.cartas.size();
        assertEquals(tamañoAntes, tamañoDespues);
    }

    @Test
    public void testSolicitarCartaReduceTamaño() throws NoHayMasCartasException {
        int tamañoInicial = mazo.cartas.size();
        mazo.solicitarCarta();
        assertEquals(tamañoInicial - 1, mazo.cartas.size());
    }

    @Test
    public void testSolicitarCartaLanzaExcepcion() {
        Mazo mazoVacio = new Mazo();
        mazoVacio.cartas.clear();
        assertThrows(NoHayMasCartasException.class, () -> {
            mazoVacio.solicitarCarta();
        });
    }
}
