package modelo;

/**
 * Representa una carta de un mazo de cartas.
 * Contiene un valor y un palo.
 *
 * @author Alexis
 * @version 1.0
 */
public class Carta {

	/**
	 * Enumeración de los posibles palos de una carta.
	 */
	public enum Palo {
		TREBOl, DIAMANTE, CORAZONES, PICAS
	}

	private int numero;
	private Palo palo;

	/**
	 * Constructor de la clase Carta.
	 *
	 * @param palo   El palo de la carta (corazones, diamantes, tréboles, picas).
	 * @param numero El valor de la carta (1-13).
	 */
	public Carta(int numero, Palo palo) {
		if (numero >= 1 && numero <= 13) {
			this.numero = numero;
			this.palo = palo;
		}
	}

	/**
	 * Obtiene el valor de la carta.
	 *
	 * @return El valor de la carta.
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Obtiene el palo de la carta.
	 *
	 * @return El palo de la carta.
	 */
	public Palo getPalo() {
		return palo;
	}

	/**
	 * Devuelve el valor de la carta según las reglas del Blackjack.
	 *
	 * @return Valor de la carta: 11 si es As, 10 si es figura, o su valor numérico.
	 */
	public int getValor() {
		int valor;

		if (this.numero >= 2 && this.numero <= 10) {
			valor = this.numero;
		} else if (this.numero == 1) {
			valor = 11;
		} else {
			valor = 10;
		}

		return valor;
	}

	/**
	 * Devuelve la representación en texto del número de la carta.
	 *
	 * @return "AS" si es 1, "J" si es 11, "Q" si es 12, "K" si es 13, o el número.
	 */
	public String mostrarNumero() {
        if (this.numero == 1) {
            return "AS";
        } else if (this.numero == 11) {
            return "J";
        } else if (this.numero == 12) {
            return "Q";
        } else if (this.numero == 13) {
            return "K";
        }
        return "" + this.numero;
    }

	/**
	 * Devuelve una representación en cadena de la carta.
	 *
	 * @return Una cadena con el número y el palo de la carta.
	 */
	@Override
	public String toString() {
		return "["+ mostrarNumero() + " - " + palo + "]";
	}

}
