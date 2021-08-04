package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector1 {

	public static void main(String[] args) {
		// Declare un vector char X[3] y construya un programa que pida al usuario que
		// ingrese los valores de cada posicion
       //y finalmente que se imprima todos los valores ingresados
		char X[] = new char[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Ingrese el valor de la posicion: " + i);
			Scanner teclado = new Scanner(System.in);
			char n = teclado.next().charAt(0);
			X[i] = n;
		}
		//Recorriendo el vector lleno
		for (int i = 0; i < 3; i++) {
		System.out.println("El valor de la posicion: " + i);
		System.out.println(X[i]);
		}
	}

}
