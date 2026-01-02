package programaGestionNotas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Program1Test {

	@Test
	void testCalcularMediaArrayNull() {
		assertEquals(0, Program1.calcularMedia(null));
	}
	
	@Test
	void testCalcularMediaArrayVacio() {
		double [] notas = {};
		assertEquals(0, Program1.calcularMedia(notas));
	}
	
	@Test
	void testCalcularMediaArrayValorUnico() {
		double [] notas = {5};
		assertEquals(5.0, Program1.calcularMedia(notas));
	}
	
	@Test
	void testCalcularMediaArrayNormal() {
		double [] notas = {6, 3.7, 5, 10, 9, 8.8};
		double suma = 0;
		for (int i = 0; i < notas.length; i++) {
			suma += notas[i];
		}
		double media = suma / notas.length;
		assertEquals(media, Program1.calcularMedia(notas));
	}
	
	@Test
	void testEncontrarNotaMaximaArrayNull() {
		assertEquals(0, Program1.encontrarNotaMaxima(null));
	}
	
	@Test
	void testEncontrarNotaMaximaArrayVacio() {
		double [] notas = {};
		assertEquals(0, Program1.encontrarNotaMaxima(notas));
	}
	
	@Test
	void testEncontrarNotaMaximaArrayValorUnico() {
		double [] notas = {5};
		assertEquals(5.0, Program1.encontrarNotaMaxima(notas));
	}
	
	@Test
	void testEncontrarNotaMaximaArrayNoraml() {
		double [] notas = {4, 5.5, 8, 9.7, 6.8};
		assertEquals(9.7, Program1.encontrarNotaMaxima(notas));
	}
	
	@Test
	void testContarAprobadosArrayNull() {
		assertEquals(0, Program1.contarAprobados(null));
	}
	
	@Test
	void testContarAprobadosArrayValorLimite() {
		double [] notas = {5};
		assertEquals(1, Program1.contarAprobados(notas));
	}
	
	@Test
	void testContarAprobadosArrayValorMenorCinco() {
		double [] notas = {4.9};
		assertEquals(0, Program1.contarAprobados(notas));
	}
	
	@Test
	void testContarAprobadosArrayValorMeyorCinco() {
		double [] notas = {5.1};
		assertEquals(1, Program1.contarAprobados(notas));
	}
	
	@Test
	void testContarAprobadosArrayNormal() {
		double [] notas = {3.2, 4.5, 6, 7.7, 8, 9, 10, 5};
		assertEquals(6, Program1.contarAprobados(notas));
	}
	
	@Test
	void testActualizarNotaArrayNull() {
		Program1.actualizarNota(null, 0, 5);
		assertTrue(true);
	}
	
	@Test
	void testActualizarNotaValida() {
		double [] notas = {4.5, 8, 6.5};
		Program1.actualizarNota(notas, 0, 7);
		assertEquals(7, notas[0]);
	}
	
	@Test
	void testActualizarNotaMenorDeCero() {
		double [] notas = {4.5, 8, 6.5};
		Program1.actualizarNota(notas, 0, -3);
		assertEquals(0, notas[0]);
	}
	
	@Test
	void testActualizarNotaMayorDeDiec() {
		double [] notas = {4.5, 8, 6.5};
		Program1.actualizarNota(notas, 0, 12);
		assertEquals(10, notas[0]);
	}
	
	@Test
	void testActualizarValorLimiteInf() {
		double [] notas = {4.5, 8, 6.5};
		Program1.actualizarNota(notas, 0, 0);
		assertEquals(0, notas[0]);
	}
	
	@Test
	void testActualizarNotaValorLimiteSup() {
		double [] notas = {4.5, 8, 6.5};
		Program1.actualizarNota(notas, 0, 10);
		assertEquals(10, notas[0]);
	}
	
	@Test
	void testActualizarNotaIndiceFueraRangoInf() {
		double [] notas = {4.5, 8, 6.5};
		Program1.actualizarNota(notas, -1, 7);
		assertEquals(4.5, notas[0]);
	}
	
	@Test
	void testActualizarNotaIndiceFueraRangoSup() {
		double [] notas = {4.5, 8, 6.5};
		Program1.actualizarNota(notas, 5, 7);
		assertEquals(4.5, notas[0]);
	}
}
