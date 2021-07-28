package diagramas.prueba;

import java.util.Scanner;

public class MainPruebaDos {

	public static void main(String[] args) {
		int sp = 0;
		int si = 0;
		float pi = 0;
		int i = 0;
		int ci = 0;
		for (i = 1; i != -1; i++) {
			System.out.println("Ingrese un numero positivo");
			Scanner teclado = new Scanner(System.in);
			int n = teclado.nextInt();
			if (n == -1) {
				i = -2;
			} else {
				if (n % 2 == 0) {
					sp = sp + n;
				} else {
					si = si + n;
					ci = ci + 1;
					pi = si / ci;
				}
			}
		}
		System.out.println("La suma de los numeros pares ingresados es:" + sp);
		System.out.println("El promedio de los numeros impares ingresados es:" + pi);
	}
}
