package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clases.Clase_1_Suma;

class Clase_1_SumaTest {
	private Clase_1_Suma sumas;

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
		sumas = new Clase_1_Suma();
		System.out.println("Comenzando el test:");
	}

	@AfterEach
	void tearDown() throws Exception {
		sumas = null;
		System.out.println("Finalizando el test" + "\n");
	}

	@Test
	void testSumarDosNumerosReales_1() {
		System.out.println("testSumarDosNumerosReales_1");
		double resultadoReal = sumas.sumarDosNumerosReales(4, 6);
		double resultadoEsperado = 10;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testSumarDosNumerosReales_2() {
		System.out.println("testSumarDosNumerosReales_2");
		double resultadoReal = sumas.sumarDosNumerosReales(-4, 6);
		double resultadoEsperado = -1;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testSumarDosNumerosEnteros_1() {
		System.out.println("testSumarDosNumerosEnteros_1");
		int resultadoReal = sumas.sumarDosNumerosEnteros(4, 6);
		int resultadoEsperado = 10;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testSumarDosNumerosEnteros_2() {
		System.out.println("testSumarDosNumerosEnteros_2");
		int resultadoReal = sumas.sumarDosNumerosEnteros(-4, 6);
		int resultadoEsperado = -1;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testSumarTresNumerosReales_1() {
		System.out.println("testSumarTresNumerosReales_1");
		double resultadoReal = sumas.sumarTresNumerosReales(3, 5, 7);
		double resultadoEsperado = 15;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testSumarTresNumerosReales_2() {
		System.out.println("testSumarTresNumerosReales_2");
		double resultadoReal = sumas.sumarTresNumerosReales(-3, 5, 7);
		double resultadoEsperado = -1;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testAcumularSuma_1() {
		System.out.println("testAcumularSuma_1");
		sumas.acumularSuma(4);
		double resultadoReal = sumas.acumularSuma(6);
		double resultadoEsperado = 10;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testAcumularSuma_2() {
		System.out.println("testAcumularSuma_2");
		sumas.acumularSuma(4);
		double resultadoReal = sumas.acumularSuma(-6);
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