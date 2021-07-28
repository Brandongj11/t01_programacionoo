package diagramas.prueba;

import java.util.Scanner;

public class MainPruebaUno {

	public static void main(String[] args) {
		int s = 0;
		float p = 0;
		int i = 0;
		int c = 0;
		for (i = 1; i != 0; i++) {
			System.out.println("Ingrese un numero positivo");
			Scanner teclado = new Scanner(System.in);
			int n = teclado.nextInt();
			if (n == 0) {
				i = -1;
			} else {
				s = s + n;
				c = c + 1;
				p = s / c;
			}
		}
		System.out.println("La suma de los numeros ingresados es:" + s);
		System.out.println("El promedio de los numeros ingresados es:" + p);
		System.out.println("La cantidad de numeros ingresados es:" + c);
	}
}

