package ejercicios.varios.vectores.matrices;

public class MainMatriz3 {

	public static void main(String[] args) {
		int A[][] = new int[5][5];
		System.out.println("Iniciamos a Imprimir la matriz");
		for (int fila = 0; fila < 5; fila++) {
			for (int columna = 0; columna < 5; columna++) {
				if (fila == columna) {
					A[fila][columna] = 1;
				} else {
					A[fila][columna] = 0;
				}

				System.out.print(A[fila][columna] + "");

			}
			System.out.println();
		}
	}
}

