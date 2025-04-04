package modelo;

import java.util.ArrayList;
import excepciones.NoHayMasCartasException;

/**
 * Representa la mano de un jugador, que hereda de la clase Mazo.
 * Permite calcular el valor total de la mano, determinar si el juego ha terminado,
 * pedir cartas de otro mazo, y mostrar el contenido de la mano.
 *
 * @author Alexis
 * @version 1.0
 */
public class Mano extends Mazo {

	/**
	 * Constructor por defecto. Inicializa la mano como una lista vacía de cartas.
	 */
	public Mano() {
		this.cartas = new ArrayList<Carta>();
	}

	/**
	 * Calcula el valor total de la mano sumando los valores de todas las cartas.
	 *
	 * @return El valor total de la mano.
	 */
	public int valorMano() {
		int valor = 0;
		for (Carta carta : this.cartas) {
			valor += carta.getValor();
		}
		return valor;
	}

	/**
	 * Determina si el juego ha terminado para esta mano (si el valor es 21 o más).
	 *
	 * @return true si el valor de la mano es mayor o igual a 21, false en caso contrario.
	 */
	public boolean finDeJuego() {
		return this.valorMano() >= 21;
	}

	/**
	 * Devuelve una representación en cadena de la mano,
	 * incluyendo su valor y las cartas que contiene.
	 *
	 * @return Una cadena describiendo la mano.
	 */
	@Override
	public String toString() {
		String res = "Valor de la Mano: " + this.valorMano() + "\n";
		res += super.toString();
		return res;
	}

	/**
	 * Solicita una carta de otro mazo y la añade a la mano.
	 *
	 * @param m El mazo del que se solicita la carta.
	 * @throws NoHayMasCartasException si el mazo no tiene más cartas.
	 */
	public void pedirCarta(Mazo m) throws NoHayMasCartasException {
		Carta c = m.solicitarCarta();
		this.cartas.add(c);
	}
}