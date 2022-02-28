package clases;

/**
 * <h3>Clase que contiene los métodos relacionados con sumar de la calculadora.</h3>
 * <h3>Esta clase será usada para el funcionamiento de la calculadora.</h3>
 * 
 * @version <b>1.0</b>
 * @author <b>DAVID GÓMEZ</b>
 */
public class Clase_2_Resta {
	
	/**
	 * <b>Valor que acumula la resta del metodo acumularSuma(double).</b>
	 */
	private double acumulado;
	
	/**
	 * <b>Método que recibe 2 números reales y devuelve la resta.</b>
	 * 
	 * @param numero1 <b>Primer número que se va a restar.</b>
	 * @param numero2 <b>Segundo número que se va a restar.</b>
	 * @return <b>Resultado de la resta.</b>
	 */
	public double restarDosNumerosReales(double numero1, double numero2) {
		if (numero1 >= 0 & numero2 >= 0) {
			double resultado = numero1 - numero2;
			return resultado;
		}
		else
		return -1;
	}
	
	/**
	 * <b>Método que recibe 2 números enteros y devuelve la resta.</b>
	 * 
	 * @param numero1 <b>Primer número que se va a restar.</b>
	 * @param numero2 <b>Segundo número que se va a restar.</b>
	 * @return <b>Resultado de la restar.</b>
	 */
	public int restarDosNumerosEnteros(int numero1, int numero2) {
		if (numero1 >= 0 & numero2 >= 0) {
			int resultado = numero1 - numero2;
			return resultado;
		}
		else
		return -1;
	}
	
	/**
	 * <b>Método que recibe 3 números reales y devuelve la resta.</b>
	 * 
	 * @param numero1 <b>Primer número que se va a restar.</b>
	 * @param numero2 <b>Segundo número que se va a restar.</b>
	 * @param numero3 <b>Tercer número que se va a restar.</b>
	 * @return <b>Resultado de la resta.</b>
	 */
	public double restarTresNumerosReales(double numero1, double numero2, double numero3) {
		if (numero1 >= 0 & numero2 >= 0 & numero3 >= 0) {
			double resultado = numero1 - numero2 - numero3;
			return resultado;
		}
		else
		return -1;
	}
	
	/**
	 * <b>Método que recibe un valor y lo resta al atributo "acumulado" de la clase.</b>
	 * 
	 * @param numero1 <b>Valor que se resta al acumulado.</b>
	 */
	public double acumularResta(double numero1) {
		if (numero1 >= 0) {
			acumulado -= numero1;
			return acumulado;
		}
		else
		return -1;
	}
}