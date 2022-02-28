package clases;

/**
 * <h3>Clase que contiene los m�todos relacionados con sumar de la calculadora.</h3>
 * <h3>Esta clase ser� usada para el funcionamiento de la calculadora.</h3>
 * 
 * @version <b>1.0</b>
 * @author <b>DAVID G�MEZ</b>
 */
public class Clase_1_Suma {
	
	/**
	 * <b>Valor que acumula la suma del metodo acumularSuma(double).</b>
	 */
	private double acumulado;
	
	/**
	 * <b>M�todo que recibe 2 n�meros reales y devuelve la suma.</b>
	 * 
	 * @param numero1 <b>Primer n�mero que se va a sumar.</b>
	 * @param numero2 <b>Segundo n�mero que se va a sumar.</b>
	 * @return <b>Resultado de la suma.</b>
	 */
	public double sumarDosNumerosReales(double numero1, double numero2) {
		if (numero1 >= 0 & numero2 >= 0) {
			double resultado = numero1 + numero2;
			return resultado;
		}
		else
		return -1;
	}
	
	/**
	 * <b>M�todo que recibe 2 n�meros enteros y devuelve la suma.</b>
	 * 
	 * @param numero1 <b>Primer n�mero que se va a sumar.</b>
	 * @param numero2 <b>Segundo n�mero que se va a sumar.</b>
	 * @return <b>Resultado de la suma.</b>
	 */
	public int sumarDosNumerosEnteros(double numero1, double numero2) {
		if (numero1 >= 0 & numero2 >= 0) {
			double resultado = numero1 + numero2;
			return (int)resultado;
		}
		else
		return -1;
	}
	
	/**
	 * <b>M�todo que recibe 3 n�meros reales y devuelve la suma.</b>
	 * 
	 * @param numero1 <b>Primer n�mero que se va a sumar.</b>
	 * @param numero2 <b>Segundo n�mero que se va a sumar.</b>
	 * @param numero3 <b>Tercer n�mero que se va a sumar.</b>
	 * @return <b>Resultado de la suma.</b>
	 */
	public double sumarTresNumerosReales(double numero1, double numero2, double numero3) {
		if (numero1 >= 0 & numero2 >= 0 & numero3 >= 0) {
			double resultado = numero1 + numero2 + numero3;
			return resultado;
		}
		else
		return -1;
	}
	
	/**
	 * <b>M�todo que recibe un valor y lo suma al atributo "acumulado" de la clase.</b>
	 * 
	 * @param numero1 <b>Valor que se suma al acumulado.</b>
	 */
	public double acumularSuma(double numero1) {
		if (numero1 >= 0) {
			acumulado += numero1;
			return acumulado;
		}
		else
		return -1;
	}
}