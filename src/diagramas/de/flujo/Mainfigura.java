package diagramas.de.flujo;

import java.util.Scanner;

public class Mainfigura {

	public static void main(String[] args) {
		System.out.print("Ingrese el numero de filas:");
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		for (int fila = 1; fila <= n; fila=fila+1) {
			for (int ast = 1; ast <= fila; ast=ast+1) {
				System.out.print("*");
			}
			System.out.println();//Salto de linea 
		}
	}
}
