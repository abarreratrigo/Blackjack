package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import modelo.Carta.Palo;
import excepciones.NoHayMasCartasException;

/**
 * Representa un mazo de cartas. Contiene una lista de cartas
 * que se puede barajar y de la que se pueden solicitar cartas.
 *
 * @author Alexis
 * @version 1.0
 */
public class Mazo {

	/**
	 * Lista de cartas que componen el mazo.
	 */
	protected List<Carta> cartas;

	/**
	 * Constructor del mazo. Inicializa el mazo con las 52 cartas
	 * de una baraja estándar (13 números por cada uno de los 4 palos).
	 */
	public Mazo() {
		this.cartas = new ArrayList<Carta>();
		for (Palo palo : Palo.values()) {
			for (int i = 1; i <= 13; i++) {
				Carta carta = new Carta(i, palo);
				this.cartas.add(carta);
			}
		}
	}

	/**
	 * Baraja las cartas del mazo de forma aleatoria.
	 */
	public void barajar() {
		Collections.shuffle(cartas);
	}

	/**
	 * Devuelve una representación en cadena del contenido del mazo.
	 *
	 * @return Una cadena con todas las cartas del mazo.
	 */
	@Override
	public String toString() {
		String res = "";
		for (Carta carta : cartas) {
			res += carta.toString() + "\n";
		}
		return res;
	}

	/**
	 * Solicita (extrae) la primera carta del mazo.
	 *
	 * @return La carta extraída del mazo.
	 * @throws NoHayMasCartasException si no quedan cartas en el mazo.
	 */
	public Carta solicitarCarta() throws NoHayMasCartasException {
		if (this.cartas.isEmpty()) {
			throw new NoHayMasCartasException();
		}
		Carta carta = this.cartas.getFirst();
		this.cartas.removeFirst();
		return carta;
	}
}
