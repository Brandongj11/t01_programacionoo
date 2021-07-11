package diagramas.de.flujo;

import java.util.Scanner;

public class Main2 {
//Imprimir en pantalla los 10 primeros numeros impares
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		for (int c = 1; c <= 19; c = c + 2) {
			System.out.println(+c);
		}
	}
}
