package clases;

public class Calculadora {

	public static void main(String[] args) {
		// Comprobar Sumas
		System.out.println("Comprobar Sumas");
		Clase_1_Suma sumas = new Clase_1_Suma();
		System.out.println(sumas.sumarDosNumerosReales(3, 3));
		System.out.println(sumas.sumarDosNumerosEnteros(3, 3));
		System.out.println(sumas.sumarTresNumerosReales(3, 3, 3));
		System.out.println(sumas.acumularSuma(5));
		System.out.println(sumas.acumularSuma(5));
		
		// Comprobar Restas
		System.out.println("\n" + "Comprobar Restas");
		Clase_2_Resta restas = new Clase_2_Resta();
		System.out.println(restas.restarDosNumerosReales(10, 3));
		System.out.println(restas.restarDosNumerosEnteros(10, 3));
		System.out.println(restas.restarTresNumerosReales(10, 2, 2));
		System.out.println(restas.acumularResta(5));
		System.out.println(restas.acumularResta(5));
		
		// Comprobar Multiplicaciones
		System.out.println("\n" + "Comprobar Multiplicaciones");
		Clase_3_Producto multiplicaciones = new Clase_3_Producto();
		System.out.println(multiplicaciones.multiplicarDosNumerosReales(2, 3));
		System.out.println(multiplicaciones.multiplicarDosNumerosEnteros(2, 3));
		System.out.println(multiplicaciones.multiplicarTresNumerosReales(2, 3, 4));
		System.out.println(multiplicaciones.potencia(5, 2));
		
		// Comprobar Divisiones
		System.out.println("\n" + "Comprobar Divisiones");
		Clase_4_Cociente divisiones = new Clase_4_Cociente();
		System.out.println(divisiones.dividirDosNumerosReales(10, 2));
		System.out.println(divisiones.dividirDosNumerosEnteros(10, 2));
		System.out.println(divisiones.inversoUnNumeroReal(2));
		System.out.println(divisiones.raizCuadrada(25));
	}
}