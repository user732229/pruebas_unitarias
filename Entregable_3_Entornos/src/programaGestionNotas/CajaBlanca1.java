package programaGestionNotas;

public class CajaBlanca1 {

	public static void main(String[] args) {
		System.out.println("PRUEBAS DE CAJA BLANCA PARA PROGRAMA DE GESTIÓN DE NOTAS:\n");
		System.out.println("Método CALCULAR MEDIA: ");
		pruebaCalcularMedia();
		System.out.println("--------------------------------\n");
		System.out.println("Método ENCONTRAR NOTA MÁXIMA: ");
		pruebaEncontrarNotaMaxima();
		System.out.println("--------------------------------\n");
		System.out.println("Método CONTAR APROBADOS: ");
		pruebaContarAprobados();
		System.out.println("--------------------------------\n");
		System.out.println("Método ACTUALIZAR NOTA: ");
		pruebaActualizarNota();

	}

	public static void pruebaCalcularMedia() {
		double[] notasej1 = {};
		double[] notasej2 = {5};
		double[] notasej3 = {3.0, 5.5, 4.0, 6.0, 6.7, 5.0, 7.0, 4.7, 6.2, 4.0};
		
	    System.out.println("Prueba del método calcular media con array null (valor esperado = 0): "+ Program1.calcularMedia(null));
		System.out.println("Prueba del método calcular media con el array vacío (valor esperado = 0): " + Program1.calcularMedia(notasej1));
		System.out.println("Prueba del método calcular media con solo 1 número en el array(valor esperado = " + notasej2[0] + "): " + Program1.calcularMedia(notasej2));
		System.out.println("Prueba del método calcular media con 10 números en el array(valor esperado = media de " + java.util.Arrays.toString(notasej3) + "): " + Program1.calcularMedia(notasej3));
	}
	
	public static void pruebaEncontrarNotaMaxima() {
		double[] notasej1 = {};
		double[] notasej2 = {5};
		double[] notasej3 = {3.0, 5.5, 4.0, 6.0, 6.7, 5.0, 7.0, 4.7, 6.2, 4.0};
		
	    System.out.println("Prueba del método encontrar nota máxima con array null (valor esperado = 0): "+ Program1.encontrarNotaMaxima(null));
		System.out.println("Prueba del método encontrar nota máxima con el array vacío (valor esperado = 0): " + Program1.encontrarNotaMaxima(notasej1));
		System.out.println("Prueba del método encontrar nota máxima con solo 1 número en el array(valor esperado = " + notasej2[0] + "): " + Program1.encontrarNotaMaxima(notasej2));
		System.out.println("Prueba del método encontrar nota máxima con 10 números en el array(valor esperado = valor más alto de " + java.util.Arrays.toString(notasej3) + "): " + Program1.encontrarNotaMaxima(notasej3));
	}
	
	public static void pruebaContarAprobados() {
		double[] notasej1 = {5};
		double[] notasej2 = {2};
		double[] notasej3 = {7};
		double[] notasej4 = {3.0, 5.5, 4.0, 6.0, 6.7, 5.0, 7.0, 4.7, 6.2, 4.0};
		
	    System.out.println("Prueba del método contar aprobados con array null (valor esperado = 0): "+ Program1.contarAprobados(null));
		System.out.println("Prueba del método contar aprobados con valor límite (valor esperado = " + notasej1.length + "): " + Program1.contarAprobados(notasej1));
		System.out.println("Prueba del método contar aprobados con valor < 5 (valor esperado = 0): "+ Program1.contarAprobados(notasej2));
		System.out.println("Prueba del método contar aprobados con valor > 5 (valor esperado = " + notasej3.length + "): " + Program1.contarAprobados(notasej3));
		System.out.println("Prueba del método encontrar aprobados con 10 números en el array, 6 aprobados y 4 suspensos (valor esperado = 6): " + Program1.contarAprobados(notasej4));
	}
	
	public static void pruebaActualizarNota() {
		double[] notasej1 = {3};
		
		System.out.println("Valor inicial: " + java.util.Arrays.toString(notasej1));
		
		Program1.actualizarNota(null, 0, 0);
	    System.out.println("Prueba del método actualizar nota con array null (valor esperado = 3, no se modifica): " + java.util.Arrays.toString(notasej1));
	    
	    Program1.actualizarNota(notasej1, 0, -3);
		System.out.println("Prueba del método actualizar nota por debajo del valor límite (valor esperado = 0): " + java.util.Arrays.toString(notasej1));
		
		Program1.actualizarNota(notasej1, 0, 0);
		System.out.println("Prueba del método actualizar nota para el valor límite inferior (valor esperado = 0): " + java.util.Arrays.toString(notasej1));
		
		Program1.actualizarNota(notasej1, 0, 5.5);
		System.out.println("Prueba del método actualizar nota para valor > 0 y < 10 (valor esperado = valor introducido (5.5): " + java.util.Arrays.toString(notasej1));
		
		Program1.actualizarNota(notasej1, 0, 10);
		System.out.println("Prueba del método actualizar nota para el valor límite superior (valor esperado = 10): " + java.util.Arrays.toString(notasej1));
		
		Program1.actualizarNota(notasej1, 0, 11);
		System.out.println("Prueba del método actualizar nota para valor superior al límite (valor esperado = 10): " + java.util.Arrays.toString(notasej1));
		
		Program1.actualizarNota(notasej1, 3, 7);
		System.out.println("Prueba del método actualizar nota con índice fuera de rango por encima (valor esperado = último valor actualizado (10)): " + java.util.Arrays.toString(notasej1));
		
		Program1.actualizarNota(notasej1, -2, 7);
		System.out.println("Prueba del método actualizar nota con índice fuera de rango por debajo (valor esperado = último valor actualizado (10)): " + java.util.Arrays.toString(notasej1));
	}
}