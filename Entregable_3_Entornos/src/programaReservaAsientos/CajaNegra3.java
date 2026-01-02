package programaReservaAsientos;

public class CajaNegra3 {

	public static void main(String[] args) {
		System.out.println("PRUEBAS DE CAJA NEGRA PARA PROGRAMA DE RESERVA DE ASIENTOS:\n");
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
		System.out.println("Prueba del método contarLibres con fila inexistente (Valor esperado = 0): " + Program3.contarLibres(null));
		System.out.println("Prueba del método contarLibres con fila sin asientos (Valor esperado = 0): " + Program3.contarLibres(new boolean [] {}));
		System.out.println("Prueba del método contarLibres con fila con 1 asiento libre (Valor esperado = 1): " + Program3.contarLibres(new boolean [] {false}));
		System.out.println("Prueba del método contarLibres con fila con 1 asiento ocupado (Valor esperado = 0): " + Program3.contarLibres(new boolean [] {true}));
		System.out.println("Prueba del método contarLibres con fila con 5 asientos, 3 libres y 2 ocupados (Valor esperado = 3): " + Program3.contarLibres(new boolean [] {false, false, false, true, true}));
	}
	
	public static void pruebaContarOcupados() {
		System.out.println("Prueba del método contarOcupados con fila inexistente (Valor esperado = 0): " + Program3.contarOcupados(null));
		System.out.println("Prueba del método contarOcupados con fila sin asientos (Valor esperado = 0): " + Program3.contarOcupados(new boolean [] {}));
		System.out.println("Prueba del método contarOcupados con fila con 1 asiento libre (Valor esperado = 0): " + Program3.contarOcupados(new boolean [] {false}));
		System.out.println("Prueba del método contarOcupados con fila con 1 asiento ocupado (Valor esperado = 1): " + Program3.contarOcupados(new boolean [] {true}));
		System.out.println("Prueba del método contarOcupados con fila con 5 asientos, 3 libres y 2 ocupados (Valor esperado = 2): " + Program3.contarOcupados(new boolean [] {false, false, false, true, true}));
	}
	
	public static void pruebaEstaCompleta() {
		System.out.println("Prueba del método estaCompleta con fila inexistente (Valor esperado = false): " + Program3.estaCompleta(null));
		System.out.println("Prueba del método estaCompleta con fila sin asientos (Valor esperado = false): " + Program3.estaCompleta(new boolean [] {}));
		System.out.println("Prueba del método estaCompleta con fila con 1 asiento libre (Valor esperado = false): " + Program3.estaCompleta(new boolean [] {false}));
		System.out.println("Prueba del método estaCompleta con fila con 1 asiento ocupado (Valor esperado = true): " + Program3.estaCompleta(new boolean [] {true}));
		System.out.println("Prueba del método estaCompleta con fila con 5 asientos, 3 libres y 2 ocupados (Valor esperado = false): " + Program3.estaCompleta(new boolean [] {false, false, false, true, true}));
		System.out.println("Prueba del método estaCompleta con fila con 5 asientos, todos ocupados (Valor esperado = true): " + Program3.estaCompleta(new boolean [] {true, true, true, true, true}));
	}
	
	public static void pruebaReservarAsiento() {
		boolean [] fila1 = {true, true, false, false, false};
		
		System.out.println("Estado inicial de la fila: " + java.util.Arrays.toString(fila1));
		
		Program3.reservarAsiento(null, 0);
		System.out.println("Prueba del método reservarAsiento sin seleccionar la fila (Valor esperado = sin cambios en la fila): " + java.util.Arrays.toString(fila1));
		
		Program3.reservarAsiento(fila1, -2);
		System.out.println("Prueba del método reservarAsiento poniendo un número de asiento negativo (Valor esperado = sin cambios en la fila): " + java.util.Arrays.toString(fila1));
		
		Program3.reservarAsiento(fila1, 7);
		System.out.println("Prueba del método reservarAsiento poniendo un número de asiento por encima de los existentes (Valor esperado = sin cambios en la fila): " + java.util.Arrays.toString(fila1));
		
		Program3.reservarAsiento(fila1, 0);
		System.out.println("Prueba del método reservarAsiento seleccionando un asiento ocupado (Valor esperado = sin cambios en la fila): " + java.util.Arrays.toString(fila1));
		
		Program3.reservarAsiento(fila1, 2);
		System.out.println("Prueba del método reservarAsiento seleccionando un asiento libre (Valor esperado = el valor false, en este caso el 3er asiento pasa a true): " + java.util.Arrays.toString(fila1));
	}
	
	public static void pruebaCancelarReserva() {
		boolean [] fila1 = {true, true, false, false, false};
		
		System.out.println("Estado inicial de la fila: " + java.util.Arrays.toString(fila1));
		
		Program3.cancelarReserva(null, 0);
		System.out.println("Prueba del método cancelarReserva sin seleccionar ninguna fila (Valor esperado = sin cambios en la fila): " + java.util.Arrays.toString(fila1));
		
		Program3.cancelarReserva(fila1, -2);
		System.out.println("Prueba del método cancelarReserva seleccionando un nº de asiento  negativo (Valor esperado = sin cambios en la fila): " + java.util.Arrays.toString(fila1));
		
		Program3.cancelarReserva(fila1, 7);
		System.out.println("Prueba del método cancelarReserva poniendo un número de asiento por encima de los existentes (Valor esperado = sin cambios en la fila): " + java.util.Arrays.toString(fila1));
		
		Program3.cancelarReserva(fila1, 1);
		System.out.println("Prueba del método cancelarReserva seleccionando un asiento ocupado (Valor esperado = el valor true, en este caso el 2º asiento pasa a false): " + java.util.Arrays.toString(fila1));
		
		Program3.cancelarReserva(fila1, 2);
		System.out.println("Prueba del método cancelarReserva seleccionando un asiento libre (Valor esperado = sin cambios en la fila: " + java.util.Arrays.toString(fila1));
	}

}
