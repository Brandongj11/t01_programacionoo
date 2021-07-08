package diagramasflujo;

import java.util.Scanner;

public class MainC {

	public static void main(String[] args) {
// TODO Auto-generated method stub
	System.out.println("Ingrese un numero:");
	Scanner teclado = new Scanner(System.in);
	int n =teclado.nextInt();
	if(n==1){
	System.out.println("Numero correcto");
	}else{
	System.out.println("Numero incorrecto");
	System.out.println("El numero es:"+n);
}
}
	
}
