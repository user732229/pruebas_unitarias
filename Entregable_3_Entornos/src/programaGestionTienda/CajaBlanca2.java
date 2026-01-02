package programaGestionTienda;

public class CajaBlanca2 {
	
	public static void main(String[] args) {
		System.out.println("PRUEBAS DE CAJA BLANCA PARA PROGRAMA DE GESTIÓN DE PEDIDOS DE UNA TIENDA:\n");
		System.out.println("Método : Prueba calcular total del pedido");
		pruebaCalcularTotalPedido();
		System.out.println("--------------------------------\n");
		System.out.println("Método : Prueba para aplicar descuento");
		pruebaAplicarDescuento();
		System.out.println("--------------------------------\n");
		System.out.println("Método : Contar total de productos caros");
		pruebaContarProductosCaros();
		System.out.println("--------------------------------\n");
		System.out.println("Método : Actualizar el precio");
		pruebaActualizarPrecio();

	}
	
	public static void pruebaCalcularTotalPedido() {
		double [] precios1 = {5};
		double [] precios2 = {5, 10, 39, 33.98, 71.2, 100};
		
		System.out.println("Prueba del método calcularTotalPedido con array null (Valor esperado = 0): " + Program2.calcularTotalPedido(null));
		System.out.println("Prueba del método calcularTotalPedido con array con un valor (Valor esperado = " + java.util.Arrays.toString(precios1) + "): " + Program2.calcularTotalPedido(precios1));
		System.out.println("Prueba del método calcularTotalPedido con array con varios valores (Valor esperado = Sumatorio de " + java.util.Arrays.toString(precios2) + "): " + Program2.calcularTotalPedido(precios2));
	}
	
	public static void pruebaAplicarDescuento() {
		double total1 = -5;
		double total2 = 0;
		double total3 = 47.69;
		double total4 = 50;
		double descuentoTotal4 = total4 - total4 * 0.05;
		double total5 = 57;
		double descuentoTotal5 = total5 - total5 * 0.05;
		double total6 = 100;
		double descuentoTotal6 = total6 - total6 * 0.10;
		double total7 = 120;
		double descuentoTotal7 = total7 - total7 * 0.10;
		
		System.out.println("Prueba del método aplicarDescuento con variable inicial < 0 (Valor esperado = 0): " + Program2.aplicarDescuento(total1));
		System.out.println("Prueba del método aplicarDescuento con variable inicial 0 (Valor esperado = 0): " + Program2.aplicarDescuento(total2));
		System.out.println("Prueba del método aplicarDescuento con variable inicial sin descuento (Valor esperado = " + total3 + "): " + Program2.aplicarDescuento(total3));
		System.out.println("Prueba del método aplicarDescuento con variable inicial al límite del primer descuento (Valor esperado = " + descuentoTotal4 + "): " + Program2.aplicarDescuento(total4));
		System.out.println("Prueba del método aplicarDescuento con variable inicial en rango dentro del primer descuento (Valor esperado = " + descuentoTotal5 + "): " + Program2.aplicarDescuento(total5));
		System.out.println("Prueba del método aplicarDescuento con variable inicial al límite del segundo descuento (Valor esperado = " + descuentoTotal6 + "): " + Program2.aplicarDescuento(total6));
		System.out.println("Prueba del método aplicarDescuento con variable inicial en rango dentro del segundo descuento (Valor esperado = " + descuentoTotal7 + "): " + Program2.aplicarDescuento(total7));
	}
	
	public static void pruebaContarProductosCaros() {
		double [] precios1 = {5};
		double [] precios2 = {5, 10, 39, 33.98, 71.2, 100};
		double umbral1 = -5;
		double umbral2 = 20;
		
		System.out.println("Prueba del método calcularcontarProductosCaros con array null (Valor esperado = 0): " + Program2.contarProductosCaros(null, umbral1));
		System.out.println("Prueba del método calcularcontarProductosCaros con array con un valor (Valor esperado = 1): " + Program2.contarProductosCaros(precios1, umbral1));
		System.out.println("Prueba del método calcularcontarProductosCaros con array con varios valores (Valor esperado = 4): " + Program2.contarProductosCaros(precios2, umbral2));
		System.out.println("Prueba del método calcularcontarProductosCaros con umbral de contador negativo que acepta todos los precios (Valor esperado = 6): " + Program2.contarProductosCaros(precios2, umbral1));
		System.out.println("Prueba del método calcularcontarProductosCaros con umbral restrictivo y precio inferior al umbral (Valor esperado = 0): " + Program2.contarProductosCaros(precios1, umbral2));
	}
	
	public static void pruebaActualizarPrecio() {
		double [] precios1 = {5};
		double [] precios2 = {5, 10, 39, 33.98, 71.2, 100};
		double nuevoprecio1 = -5;
		double nuevoprecio2 = 0;
		double nuevoprecio3 = 7;
		
		System.out.println("Valor inicial 1 = " + java.util.Arrays.toString(precios1));
		
		Program2.actualizarPrecio(null, 0, 0);
		System.out.println("Prueba del método actualizarPrecio con array null (Valor esperado = 5, no se modifica el valor inicial): " + java.util.Arrays.toString(precios1));
		
		Program2.actualizarPrecio(precios1, -2, 9);
		System.out.println("Prueba del método actualizarPrecio con índice < 0 (Valor esperado = 5, no se modifica el valor inicial): " + java.util.Arrays.toString(precios1));
		
		Program2.actualizarPrecio(precios1, 8, 9);
		System.out.println("Prueba del método actualizarPrecio con índice > longitud del array (Valor esperado = 5, no se modifica el valor inicial): " + java.util.Arrays.toString(precios1));
		
		Program2.actualizarPrecio(precios1, 0, nuevoprecio1);
		System.out.println("Prueba del método actualizarPrecio con valor a actualizar < 0 (Valor esperado = 0): " + java.util.Arrays.toString(precios1));
		
		Program2.actualizarPrecio(precios1, 0, nuevoprecio2);
		System.out.println("Prueba del método actualizarPrecio con valor límite (Valor esperado = 0): " + java.util.Arrays.toString(precios1));
		
		Program2.actualizarPrecio(precios1, 0, nuevoprecio3);
		System.out.println("Prueba del método actualizarPrecio con valor normal en array con valor único (Valor esperado = " + nuevoprecio3 + "): " + java.util.Arrays.toString(precios1));
	
		Program2.actualizarPrecio(precios2, 3, nuevoprecio3);
		System.out.println("Prueba del método actualizarPrecio con valor normal en array con valores múltiples (Valor esperado = en posición 4 del array " + nuevoprecio3 + "): " + java.util.Arrays.toString(precios2));
	}

}
