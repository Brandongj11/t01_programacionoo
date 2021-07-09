package diagramasflujo;

import java.util.Scanner;

public class MainDeber2 {

public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
System.out.println("Ingrese el primer numero:");
int a=teclado.nextInt();
System.out.println("Ingrese el segundo numero:");
int b =teclado.nextInt();
int resto = a%b;
if (resto==0){
System.out.println(a + " es multiplo de " + b);
}else{
System.out.println(a + " no es multiplo de " + b);
}
}
}