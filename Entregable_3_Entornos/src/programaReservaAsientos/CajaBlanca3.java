package programaReservaAsientos;

public class CajaBlanca3 {

	public static void main(String[] args) {
		System.out.println("PRUEBAS DE CAJA BLANCA PARA PROGRAMA DE RESERVA DE ASIENTOS:\n");
		System.out.println("Método : Contar asientos libres");
		pruebaContarLibres();
		System.out.println("--------------------------------\n");
		System.out.println("Método : Contar asientos ocupados");
		pruebaContarOcupados();
		System.out.println("--------------------------------\n");
		System.out.println("Método : Determinar si la fila está completa");
		pruebaEstaCompleta();
		System.out.println("--------------------------------\n");
		System.out.println("Método : Reservar asientos");
		pruebaReservarAsiento();
		System.out.println("--------------------------------\n");
		System.out.println("Método : Cancelar la reserva");
		pruebaCancelarReserva();

	}
	
	public static void pruebaContarLibres() {
		boolean [] fila1 = {true, true, false, false, false};
		boolean [] fila2 = {};
		boolean [] fila3 = {true};
		boolean [] fila4 = {false};
		
		System.out.println("Prueba del método contarLibres con array null (Valor esperado = 0): " + Program3.contarLibres(null));
		System.out.println("Prueba del método contarLibres con array vacío (Valor esperado = 0): " + Program3.contarLibres(fila2));
		System.out.println("Prueba del método contarLibres con array con valor true (Valor esperado = 0): " + Program3.contarLibres(fila3));
		System.out.println("Prueba del método contarLibres con array con valor false (Valor esperado = 1): " + Program3.contarLibres(fila4));
		System.out.println("Prueba del método contarLibres con array con 2 valores true y 3 false (Valor esperado = 3): " + Program3.contarLibres(fila1));
	}
	
	public static void pruebaContarOcupados() {
		boolean [] fila1 = {true, true, false, false, false};
		boolean [] fila2 = {};
		boolean [] fila3 = {true};
		boolean [] fila4 = {false};
		
		System.out.println("Prueba del método contarOcupados con array null (Valor esperado = 0): " + Program3.contarOcupados(null));
		System.out.println("Prueba del método contarOcupados con array vacío (Valor esperado = 0): " + Program3.contarOcupados(fila2));
		System.out.println("Prueba del método contarOcupados con array con valor true (Valor esperado = 1): " + Program3.contarOcupados(fila3));
		System.out.println("Prueba del método contarOcupados con array con valor false (Valor esperado = 0): " + Program3.contarOcupados(fila4));
		System.out.println("Prueba del método contarOcupados con array con 2 valores true y 3 false (Valor esperado = 2): " + Program3.contarOcupados(fila1));
	}
	
	public static void pruebaEstaCompleta() {
		boolean [] fila1 = {true, true, false, false, false};
		boolean [] fila2 = {};
		boolean [] fila3 = {true};
		boolean [] fila4 = {false};
		boolean [] fila5 = {true, true, true, true, true};
		
		System.out.println("Prueba del método estaCompleta con array null (Valor esperado = false): " + Program3.estaCompleta(null));
		System.out.println("Prueba del método estaCompleta con array vacío (Valor esperado = false): " + Program3.estaCompleta(fila2));
		System.out.println("Prueba del método estaCompleta con array con valor true (Valor esperado = true): " + Program3.estaCompleta(fila3));
		System.out.println("Prueba del método estaCompleta con array con valor false (Valor esperado = false): " + Program3.estaCompleta(fila4));
		System.out.println("Prueba del método estaCompleta con array con 2 valores true y 3 false (Valor esperado = false): " + Program3.estaCompleta(fila1));
		System.out.println("Prueba del método estaCompleta con array con 5 valores true (Valor esperado = true): " + Program3.estaCompleta(fila5));
	}
	
	public static void pruebaReservarAsiento() {
		boolean [] fila1 = {true, true, false, false, false};
		
		System.out.println("Estado inicial de la fila: " + java.util.Arrays.toString(fila1));
		
		Program3.reservarAsiento(null, 0);
		System.out.println("Prueba del método reservarAsiento con array null (Valor esperado = sin cambios en la fila): " + java.util.Arrays.toString(fila1));
		
		Program3.reservarAsiento(fila1, -2);
		System.out.println("Prueba del método reservarAsiento con índice <0 (Valor esperado = sin cambios en la fila): " + java.util.Arrays.toString(fila1));
		
		Program3.reservarAsiento(fila1, 7);
		System.out.println("Prueba del método reservarAsiento con índice > longitud del array (Valor esperado = sin cambios en la fila): " + java.util.Arrays.toString(fila1));
		
		Program3.reservarAsiento(fila1, 0);
		System.out.println("Prueba del método reservarAsiento seleccionando valor true (Valor esperado = sin cambios en la fila): " + java.util.Arrays.toString(fila1));
		
		Program3.reservarAsiento(fila1, 2);
		System.out.println("Prueba del método reservarAsiento seleccionando valor false (Valor esperado = el valor false, en este caso el 3er asiento pasa a true): " + java.util.Arrays.toString(fila1));
	}
	
	public static void pruebaCancelarReserva() {
		boolean [] fila1 = {true, true, false, false, false};
		
		System.out.println("Estado inicial de la fila: " + java.util.Arrays.toString(fila1));
		
		Program3.cancelarReserva(null, 0);
		System.out.println("Prueba del método cancelarReserva con array null (Valor esperado = sin cambios en la fila): " + java.util.Arrays.toString(fila1));
		
		Program3.cancelarReserva(fila1, -2);
		System.out.println("Prueba del método cancelarReserva con índice <0 (Valor esperado = sin cambios en la fila): " + java.util.Arrays.toString(fila1));
		
		Program3.cancelarReserva(fila1, 7);
		System.out.println("Prueba del método cancelarReserva con índice > longitud del array (Valor esperado = sin cambios en la fila): " + java.util.Arrays.toString(fila1));
		
		Program3.cancelarReserva(fila1, 1);
		System.out.println("Prueba del método cancelarReserva seleccionando valor true (Valor esperado = el valor true, en este caso el 2º asiento pasa a false): " + java.util.Arrays.toString(fila1));
		
		Program3.cancelarReserva(fila1, 2);
		System.out.println("Prueba del método cancelarReserva seleccionando valor false (Valor esperado = sin cambios en la fila: " + java.util.Arrays.toString(fila1));
	}
}
