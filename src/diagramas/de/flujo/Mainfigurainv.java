package diagramas.de.flujo;

import java.util.Scanner;

public class Mainfigurainv {

	//Excelente trabajo de clase
	public static void main(String[] args) {
		System.out.print("Ingrese el numero de filas:");
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		for (int fila = 1; fila <= n; fila++) {
			for (int ast = n; ast >= fila; ast--) {
				System.out.print("*");
			}
			System.out.println();//Salto de linea 
		}
	}

	}

