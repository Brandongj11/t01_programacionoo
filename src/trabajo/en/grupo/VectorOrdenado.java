package trabajo.en.grupo;

import java.util.Arrays;
import java.util.Scanner;

public class VectorOrdenado {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese la longitud del vector: ");
		int n = in.nextInt();
		int A[] = new int[n];
		System.out.println("Ingrese los valores del arreglo: ");
		for (int i = 0; i < n; i++) {
			A[i] = in.nextInt();
		}
		shell(A);
		System.out.println("----------Vector Ordenado----------");
		for (int i = 0; i < n; i++) {
			System.out.println("El valor de la posicion: " + i);
			System.out.println(A[i]);
		}
	}

	private static void shell(int[] a) {
		int salto = 0, temp = 0, i = 0;
		boolean cambio;
		for (salto = a.length / 2; salto != 0; salto /= 2) {
			cambio = true;
			while (cambio) {
				cambio = false;
				for (i = salto; i < a.length; i++) {
					if (a[i - salto] > a[i]) {
						temp = a[i];
						a[i] = a[i - salto];
						a[i - salto] = temp;
						cambio = true;
					}
				}
			}
		}
		System.out.println("Ordenamiento de JAVA");
		Arrays.sort(a);
		System.out.println("El vector ordenado: " + Arrays.toString(a));
	}

}