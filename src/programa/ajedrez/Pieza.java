package programa.ajedrez;

public class Pieza {

	public static void main(String[] args) {

		Peon peonNegro1 = new Peon();
		peonNegro1.setNombre("PeonNegro1");
		Peon peonNegro2 = new Peon();
		peonNegro2.setNombre("PeonNegro2");
		Peon peonNegro3 = new Peon();
		peonNegro3.setNombre("PeonNegro3");
		Peon peonNegro4 = new Peon();
		peonNegro4.setNombre("PeonNegro4");
		Peon peonNegro5 = new Peon();
		peonNegro5.setNombre("PeonNegro5");
		Peon peonNegro6 = new Peon();
		peonNegro6.setNombre("PeonNegro6");
		Peon peonNegro7 = new Peon();
		peonNegro7.setNombre("PeonNegro7");
		Peon peonNegro8 = new Peon();
		peonNegro8.setNombre("PeonNegro8");
		Peon peonBlanco1 = new Peon();
		peonBlanco1.setNombre("PeonBlanco1");
		Peon peonBlanco2 = new Peon();
		peonBlanco2.setNombre("PeonBlanco2");
		Peon peonBlanco3 = new Peon();
		peonBlanco3.setNombre("PeonBlanco3");
		Peon peonBlanco4 = new Peon();
		peonBlanco4.setNombre("PeonBlanco4");
		Peon peonBlanco5 = new Peon();
		peonBlanco5.setNombre("PeonBlanco5");
		Peon peonBlanco6 = new Peon();
		peonBlanco6.setNombre("PeonBlanco6");
		Peon peonBlanco7 = new Peon();
		peonBlanco7.setNombre("PeonBlanco7");
		Peon peonBlanco8 = new Peon();
		peonBlanco8.setNombre("PeonBlanco8");
		Torre torreNegra1 = new Torre();
		torreNegra1.setNombre("TorreNegra1");
		Torre torreNegra2 = new Torre();
		torreNegra2.setNombre("TorreNegra2");
		Torre torreBlanca1 = new Torre();
		torreBlanca1.setNombre("TorreBlanca1");
		Torre torreBlanca2 = new Torre();
		torreBlanca2.setNombre("TorreBlanca2");
		Caballo caballoNegro1 = new Caballo();
		caballoNegro1.setNombre("CaballoNegro1");
		Caballo caballoNegro2 = new Caballo();
		caballoNegro2.setNombre("CaballoNegro2");
		Caballo caballoBlanco1 = new Caballo();
		caballoBlanco1.setNombre("CaballoBlanco1");
		Caballo caballoBlanco2 = new Caballo();
		caballoBlanco2.setNombre("CaballoBlanco2");
		Alfil alfilNegro1 = new Alfil();
		alfilNegro1.setNombre("AlfilNegro1");
		Alfil alfilNegro2 = new Alfil();
		alfilNegro2.setNombre("AlfilNegro2");
		Alfil alfilBlanco1 = new Alfil();
		alfilBlanco1.setNombre("AlfilBlanco1");
		Alfil alfilBlanco2 = new Alfil();
		alfilBlanco2.setNombre("AlfilBlanco2");
		Reina reinaNegra = new Reina();
		reinaNegra.setNombre("ReinaNegra");
		Reina reinaBlanca = new Reina();
		reinaBlanca.setNombre("ReinaBlanca");
		Rey reyNegro = new Rey();
		reyNegro.setNombre("ReyNegro");
		Rey reyBlanco = new Rey();
		reyBlanco.setNombre("ReyBlanco");

		Pieza tablero[][] = new Pieza[8][8];
		tablero[0][0] = torreNegra1;
		tablero[0][1] = caballoNegro1;
		tablero[0][2] = alfilNegro1;
		tablero[0][3] = reinaNegra;
		tablero[0][4] = reyNegro;
		tablero[0][5] = alfilNegro2;
		tablero[0][6] = caballoNegro2;
		tablero[0][7] = torreNegra2;
		tablero[1][0] = peonNegro1;
		tablero[1][1] = peonNegro2;
		tablero[1][2] = peonNegro3;
		tablero[1][3] = peonNegro4;
		tablero[1][4] = peonNegro5;
		tablero[1][5] = peonNegro6;
		tablero[1][6] = peonNegro7;
		tablero[1][7] = peonNegro8;
		tablero[7][0] = torreBlanca1;
		tablero[7][1] = caballoBlanco1;
		tablero[7][2] = alfilBlanco1;
		tablero[7][3] = reinaBlanca;
		tablero[7][4] = reyBlanco;
		tablero[7][5] = alfilBlanco2;
		tablero[7][6] = caballoBlanco2;
		tablero[7][7] = torreBlanca2;
		tablero[6][0] = peonBlanco1;
		tablero[6][1] = peonBlanco2;
		tablero[6][2] = peonBlanco3;
		tablero[6][3] = peonBlanco4;
		tablero[6][4] = peonBlanco5;
		tablero[6][5] = peonBlanco6;
		tablero[6][6] = peonBlanco7;
		tablero[6][7] = peonBlanco8;

		System.out.println("Tablero de Ajedrez");
		for (int fila = 0; fila < 8; fila++) {
			for (int columna = 0; columna < 8; columna++) {
				System.out.print(tablero[fila][columna] + "");
			}
			System.out.println();
		}
	}
}
