package diagramas.de.flujo;

import java.util.Scanner;

public class Mainfecha {

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Ingrese la fecha actual: ");
	int da = in.nextInt();
	int ma = in.nextInt();
	int aa = in.nextInt();
	System.out.println("Ingrese su fecha de nacimiento: ");
	int d = in.nextInt();
	int m = in.nextInt();
	int a = in.nextInt();

	int edad = aa - a;

	if (aa == a) {
		edad = edad;
	}
	if (m > ma) {
		edad = edad - 1;
	} else if (m == ma) {
		if (d > da) {
			edad = edad - 1;
		} else {
			edad = edad;
		}
	}

	int DMN = 0; // DMN = dias, meses de nacimiento

	int dma = (ma - 1);

	if ((dma == 1 || dma == 3 || dma == 5 || dma == 7 || dma == 8 || m == 10 || dma == 0)) {
		DMN = 31;
	} else if ((dma == 4 || dma == 6 || dma == 9 || dma == 11)) {
		DMN = 30;

	}
	if ((dma == 2) && aa % 4 == 0) {
		DMN = 29;
	} else if (dma == 2) {
		DMN = 28;

	}

	int mes = m - ma;

	int dia = 1;
	if (m > ma) {
		if (d > da) {
			mes = 11 - mes;
		} else if (da > d) {
			mes = 12 - mes;
		}
	} else if (ma > m) {
		if (d > da) {
			mes = (ma - m) - 1;
		} else if (da > d) {
			mes = ma - m;
			dia = da - d;
		}
	} else if (m == ma) {
		mes = 0;
		if (d > da) {
			mes = 11 - mes;
		} else if (da > d) {
			mes = mes;
		}

	}
	if (d > da) {
		dia = DMN + da - d;

	} else if (d <= da) {
		dia = da - d;
	}
	System.out.println("--------------------SU EDAD ES DE--------------------");
	System.out.println(edad + " Años ");
	System.out.println(mes + " Meses ");
	System.out.println(dia + " Dias ");

}
}
