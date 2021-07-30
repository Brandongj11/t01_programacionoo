package diagramas.prueba;

import java.util.Scanner;

public class MainPruebaDoWhile {

	public static void main(String[] args) {
		int sp = 0;
		int si = 0;
		float pi = 0;
		int ci = 0;
		int n = 0;
		int si1 = 0;
		int ci1 = 0;
		do {
			System.out.println("Ingrese un numero positivo");
			Scanner teclado = new Scanner(System.in);
			n = teclado.nextInt();
			if (n % 2 == 0) {
				sp = sp + n;
			} else {
				si = si + n;
				ci = ci + 1;
			}
		} while (n != -1);
		si1 = si + 1;
		ci1 = ci - 1;
		pi = si1 / ci1;
		System.out.println("La suma de los numeros pares ingresados es:" + sp);
		System.out.println("El promedio de los numeros impares ingresados es:" + pi);
	}
}
