package menu.banco;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Banco del Pichincha seleccione una opción");
			System.out.println("1.Retirar dinero");
			System.out.println("2.Cambiar de clave");
			System.out.println("3.Bloquear cuenta");
			System.out.println("4.SALIR");
			opcion = teclado.nextInt();
			if (opcion == 1) {
				System.out.println("Ingrese valor a retirar: ");
				int valor = teclado.nextInt();
				System.out.println("El valor a retirar es: " + valor);
			} else if (opcion == 2) {
				System.out.println("Ingrese nueva clave: ");
				int clave = teclado.nextInt();
				System.out.println("Su clave ha sido cambiada: ");
			} else if (opcion == 3) {
				System.out.println("Su cuenta ha sido bloqueada: ");
			}
		} while (opcion != 4);
	}
}
