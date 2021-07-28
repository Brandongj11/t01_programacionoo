package diagramas.de.flujo;

import java.util.Scanner;

public class MainWhile {

	public static void main(String[] args) {
		System.out.println("Ingrese un numero:");
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		int i = 1;
		while (i <= n) {
			int r = (i * 2) + 1;
			if (r == 7 || r == 17 || r == 27) {
				System.out.println("*" + r);

			} else
				System.out.println(+r);
			i = i + 1;

		}
	}

}