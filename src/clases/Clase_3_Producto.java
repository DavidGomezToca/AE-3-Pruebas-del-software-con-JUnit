package clases;

/**
 * <h3>Clase que contiene los métodos relacionados con multiplicar de la calculadora.</h3>
 * <h3>Esta clase será usada para el funcionamiento de la calculadora.</h3>
 * 
 * @version <b>1.0</b>
 * @author <b>DAVID GÓMEZ</b>
 */
public class Clase_3_Producto {
	
	/**
	 * <b>Método que recibe 2 números reales y devuelve la multiplicación.</b>
	 * 
	 * @param numero1 <b>Primer número que se va a multiplicar.</b>
	 * @param numero2 <b>Segundo número que se va a multiplicar.</b>
	 * @return <b>Resultado de la resta.</b>
	 */
	public double multiplicarDosNumerosReales(double numero1, double numero2) {
		if (numero1 >= 0 & numero2 >= 0) {
			double resultado = numero1 * numero2;
			return resultado;
		}
		else
		return -1;
	}
	
	/**
	 * <b>Método que recibe 2 números enteros y devuelve la multiplicacion.</b>
	 * 
	 * @param numero1 <b>Primer número que se va a multiplicar.</b>
	 * @param numero2 <b>Segundo número que se va a multiplicar.</b>
	 * @return <b>Resultado de la multiplicación.</b>
	 */
	public int multiplicarDosNumerosEnteros(int numero1, int numero2) {
		if (numero1 >= 0 & numero2 >= 0) {
			int resultado = numero1 * numero2;
			return resultado;
		}
		else
		return -1;
	}
	
	/**
	 * <b>Método que recibe 3 números reales y devuelve la multiplicación.</b>
	 * 
	 * @param numero1 <b>Primer número que se va a multiplicar.</b>
	 * @param numero2 <b>Segundo número que se va a multiplicar.</b>
	 * @param numero3 <b>Tercer número que se va a multiplicar.</b>
	 * @return <b>Resultado de la multiplicación.</b>
	 */
	public double multiplicarTresNumerosReales(double numero1, double numero2, double numero3) {
		if (numero1 >= 0 & numero2 >= 0 & numero3 >= 0) {
			double resultado = numero1 * numero2 * numero3;
			return resultado;
		}
		else
		return -1;
	}

	/**
	 * <b>Método que recibe 2 números y devuelve la potencia del primero elevado al segundo.</b>
	 * 
	 * @param numero1 <b>Primer número que sera la base.</b>
	 * @param numero2 <b>Segundo número que sera el exponente.</b>
	 * @return <b>Resultado de la potencia.</b>
	 */
	public double potencia(double numero1, double numero2) {
		if (numero1 >= 0 & numero2 >= 0) {
			double resultado = Math.pow(numero1, numero2);
			return resultado;
		}
		else
		return -1;
	}
}