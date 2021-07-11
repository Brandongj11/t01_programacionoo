package diagramas.de.flujo;

import java.util.Scanner;

public class Main1 {

public static void main(String[] args) {
System.out.println("Ingrese un numero:");
Scanner teclado = new Scanner(System.in);
int n=teclado.nextInt();	
for(int c=n+1;c<=n+5;c++){
System.out.println(+c);	
}
}
}
