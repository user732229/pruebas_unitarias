package programaGestionTienda;

public class CajaNegra2 {

	public static void main(String[] args) {
		System.out.println("PRUEBAS DE CAJA NEGRA PARA PROGRAMA DE GESTIÓN DE PEDIDOS DE UNA TIENDA:\n");
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
		System.out.println("Prueba del método calcularTotalPedido con valor null (Valor esperado = 0): " + Program2.calcularTotalPedido(null));
		System.out.println("Prueba del método calcularTotalPedido con un único pedido (Valor esperado = 7): " + Program2.calcularTotalPedido(new double [] {7}));
		System.out.println("Prueba del método calcularTotalPedido con varios pedidos (Valor esperado = 100): " + Program2.calcularTotalPedido(new double [] {10,30,20,5,5,3,2,5,20}));
	}
	
	public static void pruebaAplicarDescuento() {
		System.out.println("Prueba del método aplicarDescuento con valor de compra < 0 (Valor esperado = 0): " + Program2.aplicarDescuento(-3));
		System.out.println("Prueba del método aplicarDescuento con valor de compra sin descuento (Valor esperado = 20): " + Program2.aplicarDescuento(20));
		System.out.println("Prueba del método aplicarDescuento con valor de compra en límite del primer descuento (Valor esperado = 47.5): " + Program2.aplicarDescuento(50));
		System.out.println("Prueba del método aplicarDescuento con valor de compra dentro del rango del primer descuento (Valor esperado = 76): " + Program2.aplicarDescuento(80));
		System.out.println("Prueba del método aplicarDescuento con valor de compra en el límite del segundo descuento (Valor esperado = 90): " + Program2.aplicarDescuento(100));
		System.out.println("Prueba del método aplicarDescuento con valor de compra dentro del rango del segundo descuento (Valor esperado = 180): " + Program2.aplicarDescuento(200));
	}
	
	public static void pruebaContarProductosCaros() {
		System.out.println("Prueba del método contarProductosCaros con pedido inexistente (Valor esperado = 0): " + Program2.contarProductosCaros(null, 0));
		System.out.println("Prueba del método contarProductosCaros con pedido de 1 objeto y dentro del umbral (Valor esperado = 1): " + Program2.contarProductosCaros(new double [] {20}, 15));
		System.out.println("Prueba del método contarProductosCaros con pedido de 1 objeto y fuera del umbral (Valor esperado = 0): " + Program2.contarProductosCaros(new double [] {10}, 15));
		System.out.println("Prueba del método contarProductosCaros con pedido de 1 objeto y al límite del umbral (Valor esperado = 0): " + Program2.contarProductosCaros(new double [] {15}, 15));
		System.out.println("Prueba del método contarProductosCaros con pedido de 10 objetos, 2 fuera del umbral y 8 dentro (Valor esperado = 8): " + Program2.contarProductosCaros(new double [] {5, 10, 20, 30, 40, 50, 60, 70, 80, 90}, 15));
	}
	
	public static void pruebaActualizarPrecio() {
		double [] precios1 = {5};
		double [] precios2 = {5, 10, 39, 33.98, 71.2, 100};
		double nuevoprecio1 = -5;
		double nuevoprecio2 = 0;
		double nuevoprecio3 = 7;
		
		System.out.println("Valor inicial 1 = " + java.util.Arrays.toString(precios1));
		
		Program2.actualizarPrecio(null, 0, 0);
		System.out.println("Prueba del método actualizarPrecio sin actualizar el precio (Valor esperado = 5, no se modifica el valor inicial): " + java.util.Arrays.toString(precios1));
		
		Program2.actualizarPrecio(precios1, -2, 9);
		System.out.println("Prueba del método actualizarPrecio indicando un producto negativo (Valor esperado = 5, no se modifica el valor inicial): " + java.util.Arrays.toString(precios1));
		
		Program2.actualizarPrecio(precios1, 8, 9);
		System.out.println("Prueba del método actualizarPrecio indicando un producto no existente (Valor esperado = 5, no se modifica el valor inicial): " + java.util.Arrays.toString(precios1));
		
		Program2.actualizarPrecio(precios1, 0, nuevoprecio1);
		System.out.println("Prueba del método actualizarPrecio poniendo un nuevo precio negativo (Valor esperado = 0): " + java.util.Arrays.toString(precios1));
		
		Program2.actualizarPrecio(precios1, 0, nuevoprecio2);
		System.out.println("Prueba del método actualizarPrecio actualizando a 0 el valor (Valor esperado = 0): " + java.util.Arrays.toString(precios1));
		
		Program2.actualizarPrecio(precios1, 0, nuevoprecio3);
		System.out.println("Prueba del método actualizarPrecio con un único producto en el pedido (Valor esperado = " + nuevoprecio3 + "): " + java.util.Arrays.toString(precios1));
	
		Program2.actualizarPrecio(precios2, 3, nuevoprecio3);
		System.out.println("Prueba del método actualizarPrecio con varios elementos en el pedido (Valor esperado = el nuevo precio del producto 4 es " + nuevoprecio3 + "): " + java.util.Arrays.toString(precios2));
	}
}
