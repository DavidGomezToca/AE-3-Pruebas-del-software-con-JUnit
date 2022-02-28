package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clases.Clase_2_Resta;

class Clase_2_RestaTest {
	private Clase_2_Resta restas;

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
		restas = new Clase_2_Resta();
		System.out.println("Comenzando el test:");
	}

	@AfterEach
	void tearDown() throws Exception {
		restas = null;
		System.out.println("Finalizando el test" + "\n");
	}

	@Test
	void testRestarDosNumerosReales_1() {
		System.out.println("testRestarDosNumerosReales_1");
		double resultadoReal = restas.restarDosNumerosReales(10, 5);
		double resultadoEsperado = 5;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	void testRestarDosNumerosReales_2() {
		System.out.println("testRestarDosNumerosReales_2");
		double resultadoReal = restas.restarDosNumerosReales(-10, 5);
		double resultadoEsperado = -1;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testRestarDosNumerosEnteros_1() {
		System.out.println("testRestarDosNumerosEnteros_1");
		int resultadoReal = restas.restarDosNumerosEnteros(10, 5);
		int resultadoEsperado = 5;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testRestarDosNumerosEnteros_2() {
		System.out.println("testRestarDosNumerosEnteros_2");
		int resultadoReal = restas.restarDosNumerosEnteros(-10, 5);
		int resultadoEsperado = -1;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testRestarTresNumerosReales_1() {
		System.out.println("testRestarTresNumerosReales_1");
		double resultadoReal = restas.restarTresNumerosReales(15, 6, 4);
		double resultadoEsperado = 5;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testRestarTresNumerosReales_2() {
		System.out.println("testRestarTresNumerosReales_2");
		double resultadoReal = restas.restarTresNumerosReales(-15, 6, 4);
		double resultadoEsperado = -1;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testAcumularResta_1() {
		System.out.println("testAcumularResta_1");
		restas.acumularResta(5);
		double resultadoReal = restas.acumularResta(5);
		double resultadoEsperado = -10;
		comprobarTest(resultadoEsperado, resultadoReal);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testAcumularResta_2() {
		System.out.println("testAcumularResta_2");
		restas.acumularResta(5);
		double resultadoReal = restas.acumularResta(-5);
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