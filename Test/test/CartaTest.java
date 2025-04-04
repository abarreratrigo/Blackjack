package test;

import static org.junit.jupiter.api.Assertions.*;

import modelo.Carta;
import org.junit.jupiter.api.Test;

public class CartaTest {

    @Test
    public void testGetNumero() {
        Carta carta = new Carta(5, Carta.Palo.PICAS);
        assertEquals(5, carta.getNumero());
    }

    @Test
    public void testGetPalo() {
        Carta carta = new Carta(10, Carta.Palo.CORAZONES);
        assertEquals(Carta.Palo.CORAZONES, carta.getPalo());
    }

    @Test
    public void testGetValorNumeroNormal() {
        Carta carta = new Carta(7, Carta.Palo.DIAMANTE);
        assertEquals(7, carta.getValor());
    }

    @Test
    public void testGetValorAs() {
        Carta carta = new Carta(1, Carta.Palo.TREBOl);
        assertEquals(11, carta.getValor());
    }

    @Test
    public void testGetValorFigura() {
        Carta carta = new Carta(12, Carta.Palo.TREBOl);
        assertEquals(10, carta.getValor());
    }

    @Test
    public void testMostrarNumeroAs() {
        Carta carta = new Carta(1, Carta.Palo.PICAS);
        assertEquals("AS", carta.mostrarNumero());
    }

    @Test
    public void testMostrarNumeroNumero() {
        Carta carta = new Carta(9, Carta.Palo.PICAS);
        assertEquals("9", carta.mostrarNumero());
    }
}
