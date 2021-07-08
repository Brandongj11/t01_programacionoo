package diagramasflujo;

import java.util.Scanner;

public class MainE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Ingrese su sueldo:");
Scanner teclado = new Scanner(System.in);
int s =teclado.nextInt();
if(s<300){
int b=40;
System.out.println("Su bonificacion es:"+b);
}else{
int c= 0;
System.out.println("Su bonificacion es:"+c);
}
}
}
