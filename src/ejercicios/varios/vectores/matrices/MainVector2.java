package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector2 {

	public static void main(String[] args) {
		// Declare un vector X cuya longitud se solicite al usuario , de tipo int y construya un programa que pida al usuario que
		// ingrese los valores de cada posicion
		//y finalmente que se imprima todos los valores ingresados
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la longitud del vector: ");
		int l = teclado.nextInt();
		int X[] = new int [l];
		for (int i = 0; i < l; i++) {
			System.out.println("Ingrese el valor de la posicion: " + i);
			int n = teclado.nextInt();
			X[i] = n;
		}
		//Recorriendo el vector lleno
		for (int i = 0; i < l; i++) {
		System.out.println("El valor de la posicion: " + i);
		System.out.println(X[i]);
		}
	}

}
