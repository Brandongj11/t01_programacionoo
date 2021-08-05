package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatriz2 {

	public static void main(String[] args) {
	// Declare una matriz A[3,4], y desarrolle un programa que vaya solicitando
	// cada una de sus posiciones
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el numero de filas del vector");
		//El usuario digita el numero de filas y yo debo leer desde teclado
		int LongitudFila = teclado.nextInt();
		System.out.println("Ingrese el numero de columnas del vector");
		//El usuario digita el numero de columnas y yo debo leer desde teclado
		int LongitudColumna = teclado.nextInt();
		char A[][] = new char[LongitudFila][LongitudColumna];
				for (int fila = 0; fila < LongitudFila ; fila++) {
					for (int columna = 0; columna < LongitudColumna; columna++) {
						System.out.println("Ingrese el valor fila " + fila + " columna " + columna);
						// El usuario digita el valor por teclado
					
						char n = teclado.next().charAt(0);
						A[fila][columna] = n;
					}
				}
				System.out.println("Iniciamos a Imprimir la matriz");
				for (int fila = 0; fila < LongitudFila ; fila++) {
					for (int columna = 0; columna < LongitudColumna ; columna++) {
						System.out.print(A[fila][columna]+"");
					}

				}
			}
		}




