package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clases.Clase_4_Cociente;

class Clase_4_CocienteTest {
	private Clase_4_Cociente divisiones;

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
		divisiones = new Clase_4_Cociente();
		System.out.println("Comenzando el test:");
	}

	@AfterEach
	void tearDown() throws Exception {
		divisiones = null;
		System.out.println("Finalizando el test" + "\n");
	}

	@Test
	void testDividirDosNumerosReales_1() {
		System.out.println("testDividirDosNumerosReales_1");
		double resultadoReal = divisiones.dividirDosNumerosReales(10, 2);
		double resultadoEsperado = 5;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testDividirDosNumerosReales_2() {
		System.out.println("testDividirDosNumerosReales_2");
		double resultadoReal = divisiones.dividirDosNumerosReales(-10, 2);
		double resultadoEsperado = -1;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testDividirDosNumerosEnteros_1() {
		System.out.println("testDividirDosNumerosEnteros_1");
		double resultadoReal = divisiones.dividirDosNumerosEnteros(10, 2);
		double resultadoEsperado = 5;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testDividirDosNumerosEnteros_2() {
		System.out.println("testDividirDosNumerosEnteros_2");
		double resultadoReal = divisiones.dividirDosNumerosEnteros(-10, 2);
		double resultadoEsperado = -1;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testInversoUnNumeroReal_1() {
		System.out.println("testInversoUnNumeroReal_1");
		double resultadoReal = divisiones.inversoUnNumeroReal(2);
		double resultadoEsperado = 0.5;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testInversoUnNumeroReal_2() {
		System.out.println("testInversoUnNumeroReal_2");
		double resultadoReal = divisiones.inversoUnNumeroReal(-2);
		double resultadoEsperado = -1;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testRaizCuadrada_1() {
		System.out.println("testRaizCuadrada_1");
		double resultadoReal = divisiones.raizCuadrada(25);
		double resultadoEsperado = 5;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testRaizCuadrada_2() {
		System.out.println("testraizCuadrada_2");
		double resultadoReal = divisiones.raizCuadrada(-25);
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