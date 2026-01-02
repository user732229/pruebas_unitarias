package programaReservaAsientos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProgramTest3 {

	@Test
	void testContarLibresArrayNull() {
		assertEquals(0, Program3.contarLibres(null));
	}
	
	@Test
	void testContarLibresArrayVacio() {
		boolean [] fila = {};
		assertEquals(0, Program3.contarLibres(fila));
	}
	
	@Test
	void testContarLibresArrayUnicoAsientoLibre() {
		boolean [] fila = {false};
		assertEquals(1, Program3.contarLibres(fila));
	}
	
	@Test
	void testContarLibresArrayUnicoAsientoOcupado() {
		boolean [] fila = {true};
		assertEquals(0, Program3.contarLibres(fila));
	}
	
	@Test
	void testContarLibresArrayVariosAsientos() {
		boolean [] fila = {true, true, false, false, false};
		assertEquals(3, Program3.contarLibres(fila));
	}
	
	@Test
	void testContarOcupadosArrayNull() {
		assertEquals(0, Program3.contarOcupados(null));
	}
	
	@Test
	void testContarOcupadosArrayVacio() {
		boolean [] fila = {};
		assertEquals(0, Program3.contarOcupados(fila));
	}
	
	@Test
	void testContarOcupadosArrayUnicoAsientoLibre() {
		boolean [] fila = {false};
		assertEquals(0, Program3.contarOcupados(fila));
	}
	
	@Test
	void testContarOcupadosArrayUnicoAsientoOcupado() {
		boolean [] fila = {true};
		assertEquals(1, Program3.contarOcupados(fila));
	}
	
	@Test
	void testContarOcupadosArrayVariosAsientos() {
		boolean [] fila = {true, true, false, false, false};
		assertEquals(2, Program3.contarOcupados(fila));
	}
	
	@Test
	void testEstaCompletaArrayNull() {
		assertEquals(false, Program3.estaCompleta(null));
	}
	
	@Test
	void testEstaCompletaArrayVacio() {
		boolean [] fila = {};
		assertEquals(false, Program3.estaCompleta(fila));
	}
	
	@Test
	void testEstaCompletaArrayUnicoAsientoLibre() {
		boolean [] fila = {false};
		assertEquals(false, Program3.estaCompleta(fila));
	}
	
	@Test
	void testEstaCompletaArrayUnicoAsientoOcupado() {
		boolean [] fila = {true};
		assertEquals(true, Program3.estaCompleta(fila));
	}
	
	@Test
	void testEstaCompletaArrayVariosAsientos() {
		boolean [] fila = {true, true, false, false, false};
		assertEquals(false, Program3.estaCompleta(fila));
	}
	
	@Test
	void testEstaCompletaArrayVariosAsientosOcupados() {
		boolean [] fila = {true, true, true, true, true};
		assertEquals(true, Program3.estaCompleta(fila));
	}
	
	@Test
	void testReservarAsientoArrayNull() {
		Program3.reservarAsiento(null, 0);
		assertTrue(true);
	}
	
	@Test
	void testReservarAsientoIndiceNegativo() {
		boolean [] fila = {true, true, false, false, false};
		boolean [] filaEsperada = {true, true, false, false, false};
		Program3.reservarAsiento(fila, -2);
		assertArrayEquals(fila, filaEsperada);
	}
	
	@Test
	void testReservarAsientoIndiceMayorQueOpciones() {
		boolean [] fila = {true, true, false, false, false};
		boolean [] filaEsperada = {true, true, false, false, false};
		Program3.reservarAsiento(fila, 7);
		assertArrayEquals(fila, filaEsperada);
	}
	
	@Test
	void testReservarAsientoOcupadoOcupado() {
		boolean [] fila = {true, true, false, false, false};
		Program3.reservarAsiento(fila, 0);
		assertEquals(fila[0], true);
	}
	
	@Test
	void testReservarAsientoLibreOcupado() {
		boolean [] fila = {true, true, false, false, false};
		Program3.reservarAsiento(fila, 3);
		assertEquals(fila[3], true);
	}
	
	@Test
	void testCancelarReservaArrayNull() {
		Program3.cancelarReserva(null, 0);
		assertTrue(true);
	}
	
	@Test
	void testCancelarReservaIndiceNegativo() {
		boolean [] fila = {true, true, false, false, false};
		boolean [] filaEsperada = {true, true, false, false, false};
		Program3.cancelarReserva(fila, -2);
		assertArrayEquals(fila, filaEsperada);
	}
	
	@Test
	void testCancelarReservaIndiceMayorQueOpciones() {
		boolean [] fila = {true, true, false, false, false};
		boolean [] filaEsperada = {true, true, false, false, false};
		Program3.cancelarReserva(fila, 7);
		assertArrayEquals(fila, filaEsperada);
	}
	
	@Test
	void testCancelarReservaOcupadoOcupado() {
		boolean [] fila = {true, true, false, false, false};
		Program3.cancelarReserva(fila, 0);
		assertEquals(fila[0], false);
	}
	
	@Test
	void testCancelarReservaLibreOcupado() {
		boolean [] fila = {true, true, false, false, false};
		Program3.cancelarReserva(fila, 3);
		assertEquals(fila[3], false);
	}
}
