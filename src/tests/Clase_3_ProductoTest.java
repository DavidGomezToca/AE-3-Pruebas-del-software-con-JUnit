package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clases.Clase_3_Producto;

class Clase_3_ProductoTest {
	private Clase_3_Producto multiplicaciones;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("********************");
		System.out.println("COMENZANDO LAS PRUEBAS");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("FINALIZANDO LAS PRUEBAS");
		System.out.println("********************");
	}

	@BeforeEach
	void setUp() throws Exception {
		multiplicaciones = new Clase_3_Producto();
		System.out.println("Comenzando el test:");
	}

	@AfterEach
	void tearDown() throws Exception {
		multiplicaciones = null;
		System.out.println("Finalizando el test" + "\n");
	}

	@Test
	void testMultiplicarDosNumerosReales_1() {
		System.out.println("testMultiplicarDosNumerosReales_1");
		double resultadoReal = multiplicaciones.multiplicarDosNumerosReales(2, 3);
		double resultadoEsperado = 6;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testMultiplicarDosNumerosReales_2() {
		System.out.println("testMultiplicarDosNumerosReales_2");
		double resultadoReal = multiplicaciones.multiplicarDosNumerosReales(-2, 3);
		double resultadoEsperado = -1;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testMultiplicarDosNumerosEnteros_1() {
		System.out.println("testMultiplicarDosNumerosEnteros_1");
		double resultadoReal = multiplicaciones.multiplicarDosNumerosEnteros(2, 3);
		double resultadoEsperado = 6;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testMultiplicarDosNumerosEnteros_2() {
		System.out.println("testMultiplicarDosNumerosEnteros_2");
		double resultadoReal = multiplicaciones.multiplicarDosNumerosEnteros(-2, 3);
		double resultadoEsperado = -1;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testMultiplicarTresNumerosReales_1() {
		System.out.println("testMultiplicarTresNumerosReales_1");
		double resultadoReal = multiplicaciones.multiplicarTresNumerosReales(2, 3, 4);
		double resultadoEsperado = 24;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testMultiplicarTresNumerosReales_2() {
		System.out.println("testMultiplicarTresNumerosReales_2");
		double resultadoReal = multiplicaciones.multiplicarTresNumerosReales(-2, 3, 4);
		double resultadoEsperado = -1;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testPotencia_1() {
		System.out.println("testPotencia_1");
		double resultadoReal = multiplicaciones.potencia(2, 3);
		double resultadoEsperado = 8;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testPotencia_2() {
		System.out.println("testPotencia_2");
		double resultadoReal = multiplicaciones.potencia(-2, 3);
		double resultadoEsperado = -1;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	void comprobarTest(double resultadoEsperado, double resultadoReal) {
		if (resultadoEsperado == resultadoReal) {
			System.out.println("*Bien*");
		}
		else {
			System.out.println("#Error#");
		}
	}
}