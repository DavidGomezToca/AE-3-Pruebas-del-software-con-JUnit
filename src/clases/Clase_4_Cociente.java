package clases;

/**
 * <h3>Clase que contiene los métodos relacionados con dividir de la calculadora.</h3>
 * <h3>Esta clase será usada para el funcionamiento de la calculadora.</h3>
 * 
 * @version <b>1.0</b>
 * @author <b>DAVID GÓMEZ</b>
 */
public class Clase_4_Cociente {

	/**
	 * <b>Método que recibe 2 números reales y devuelve la división del primero entre el segundo.</b>
	 * 
	 * @param numero1 <b>Primer número que sera el dividendo.</b>
	 * @param numero2 <b>Segundo número que sera el divisor.</b>
	 * @return <b>Resultado de la división.</b>
	 */
	public double dividirDosNumerosReales(double numero1, double numero2) {
		if (numero1 >= 0 & numero2 >= 0) {
			double resultado = numero1 / numero2;
			return resultado;
		}
		else
		return -1;
	}

	/**
	 * <b>Método que recibe 2 números enteros y devuelve la división del primero entre el segundo.</b>
	 * 
	 * @param numero1 <b>Primer número que sera el dividendo.</b>
	 * @param numero2 <b>Segundo número que sera el divisor.</b>
	 * @return <b>Resultado de la división.</b>
	 */
	public int dividirDosNumerosEnteros(int numero1, int numero2) {
		if (numero1 >= 0 & numero2 >= 0) {
			int resultado = numero1 / numero2;
			return resultado;
		}
		else
		return -1;
	}

	/**
	 * <b>Método que recibe 1 número real y devuelve el inverso.</b>
	 * 
	 * @param numero1 <b>Número al que se calculara el inverso.</b>
	 * @return <b>Resultado de la inversión.</b>
	 */
	public double inversoUnNumeroReal(double numero1) {
		if (numero1 >= 0) {
			double resultado = 1 / numero1;
			return resultado;
		}
		else
		return -1;
	}

	/**
	 * <b>Método que recibe 1 número y devuelve la raíz cuadrada.</b>
	 * 
	 * @param numero1 <b>Número al que se calculara la raíz cuadrada.</b>
	 * @return <b>Resultado de la raíz cuadrada.</b>
	 */
	public double raizCuadrada(double numero1) {
		if (numero1 >= 0) {
			double resultado = Math.sqrt(numero1);
			return resultado;
		}
		else
		return -1;
	}
}