package diagramasflujo;

import java.util.Scanner;

public class MainDeber1 {

public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
System.out.println("Ingrese el primer numero:");
int a=teclado.nextInt();
System.out.println("Ingrese el segundo numero:");
int b =teclado.nextInt();
if(b==0){
System.out.println("La division es imposible");
}else{
int r=a/b;
System.out.println("El resultado es:"+r);
}
}
}
