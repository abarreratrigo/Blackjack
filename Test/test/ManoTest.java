package test;

import static org.junit.jupiter.api.Assertions.*;

import modelo.Mano;
import modelo.Mazo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import excepciones.NoHayMasCartasException;

public class ManoTest {

    private Mano mano;
    private Mazo mazo;

    @BeforeEach
    public void setup() {
        mano = new Mano();
        mazo = new Mazo();
    }

    @Test
    public void testValorMano() throws NoHayMasCartasException {
        mano.pedirCarta(mazo);
        int valor = mano.valorMano();
        assertTrue(valor > 0 && valor <= 11);
    }

    @Test
    public void testFinDeJuegoFalse() {
        assertFalse(mano.finDeJuego());
    }

    @Test
    public void testPedirCarta() throws NoHayMasCartasException {
        int tamañoInicial = mano.cartas.size();
        mano.pedirCarta(mazo);
        assertEquals(tamañoInicial + 1, mano.cartas.size());
    }
}

