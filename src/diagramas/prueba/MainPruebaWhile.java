package diagramas.prueba;

import java.util.Scanner;

public class MainPruebaWhile {

	public static void main(String[] args) {
		int s = 0;
		float p = 0;
		int c = 0;
		int s1 = 0;
		int s2 = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un numero positivo");
		int n = teclado.nextInt();
		s = s + n;
		while (n != 0) {
			System.out.println("Ingrese un numero positivo");
			n = teclado.nextInt();
			s1 = s1 + n;
			s2 = s + s1;
			c = c + 1;
			p = s2 / c;
		}
		System.out.println("La suma de los numeros ingresados es:" + s2);
		System.out.println("El promedio de los numeros ingresados es:" + p);
		System.out.println("La cantidad de numeros ingresados es:" + c);
	}
}
	


