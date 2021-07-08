package diagramasflujo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	System.out.println("Ingrese dos numeros:");
	Scanner teclado = new Scanner(System.in);//TECLADO
	int A =teclado.nextInt();
	//System.out.println("Numero ingresado:"+A);
	int B =teclado.nextInt();
	//System.out.println("Numero ingresado 2:"+B);
	int S=A+B;
	int R=A-B;
	int M=A*B;
	System.out.println("La suma es:"+S);
	System.out.println("La resta es:"+R);
	System.out.println("El producto es:"+M);
}
}


