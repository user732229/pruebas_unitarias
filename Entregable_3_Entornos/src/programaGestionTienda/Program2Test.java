package programaGestionTienda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class Program2Test {

	@Test
	void testCalcularTotalPedidoArrayNull() {
		assertEquals(0, Program2.calcularTotalPedido(null));
	}
	
	@Test
	void testCalcularTotalPedidoArrayValorUnico() {
		double [] total = {5};
		assertEquals(5, Program2.calcularTotalPedido(total));
	}
	
	@Test
	void testCalcularTotalPedidoArrayValorMúltiples() {
		double [] productos = {5, 10, 15, 20};
		assertEquals(50, Program2.calcularTotalPedido(productos));
	}
	
	@Test
	void testAplicarDescuentoTotalNegativo() {
		assertEquals(0, Program2.aplicarDescuento(-7));
	}
	
	@Test
	void testAplicarDescuentoTotalSinDescuento() {
		assertEquals(30, Program2.aplicarDescuento(30));
	}

	@Test
	void testAplicarDescuentoTotalLimitePrimerDescuento() {
		assertEquals(47.5, Program2.aplicarDescuento(50));
	}

	@Test
	void testAplicarDescuentoTotalPrimerDescuento() {
		assertEquals(76, Program2.aplicarDescuento(80));
	}

	@Test
	void testAplicarDescuentoTotalLimiteSegundoDescuento() {
		assertEquals(90, Program2.aplicarDescuento(100));
	}

	@Test
	void testAplicarDescuentoTotalSegundoDescuento() {
		assertEquals(180, Program2.aplicarDescuento(200));
	}

	@Test
	void testContarProductosCarosArrayNull() {
		assertEquals(0, Program2.contarProductosCaros(null, 15));
	}

	@Test
	void testContarProductosCarosArrayValorUnicoBajoUmbral() {
		double [] productos = {5};
		assertEquals(0, Program2.contarProductosCaros(productos, 15));
	}
	
	@Test
	void testContarProductosCarosArrayValorUnicoSobreUmbral() {
		double [] productos = {20};
		assertEquals(1, Program2.contarProductosCaros(productos, 15));
	}
	
	@Test
	void testContarProductosCarosArrayValorUnicoLimiteUmbral() {
		double [] productos = {15};
		assertEquals(0, Program2.contarProductosCaros(productos, 15));
	}
	
	@Test
	void testContarProductosCarosArrayValorMultiple() {
		double [] productos = {5, 10, 15, 20, 30, 40};
		assertEquals(3, Program2.contarProductosCaros(productos, 15));
	}
	
	@Test
	void testActualizarPrecioArrayNull() {
		Program2.actualizarPrecio(null, 0, 5);
		assertTrue(true);
	}
	
	@Test
	void testActualizarPrecioIndiceNegativo() {
		double [] productos = {10};
		Program2.actualizarPrecio(productos, -3, 5);
		assertEquals(productos[0], 10);
	}
	
	@Test
	void testActualizarPrecioIndiceMayorArray() {
		double [] productos = {10};
		Program2.actualizarPrecio(productos, 2, 5);
		assertEquals(productos[0], 10);
	}
	
	@Test
	void testActualizarPrecioNuevoPrecioNegativo() {
		double [] productos = {10};
		Program2.actualizarPrecio(productos, 0, -3);
		assertEquals(productos[0], 0);
	}
	
	@Test
	void testActualizarPrecioNuevoPrecioCero() {
		double [] productos = {10};
		Program2.actualizarPrecio(productos, 0, 0);
		assertEquals(productos[0], 0);
	}
	
	@Test
	void testActualizarPrecioNormalValorUnico() {
		double [] productos = {10};
		Program2.actualizarPrecio(productos, 0, 7);
		assertEquals(productos[0], 7);
	}
	
	@Test
	void testActualizarPrecioNormalValorMultiple() {
		double [] productos = {10, 3, 20, 15};
		Program2.actualizarPrecio(productos, 2, 15);
		assertEquals(productos[2], 15);
	}
}
