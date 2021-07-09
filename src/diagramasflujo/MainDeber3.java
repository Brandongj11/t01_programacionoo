package diagramasflujo;

import java.util.Scanner;

public class MainDeber3 {

	public static void main(String[] args) {
System.out.println("Ingrese su sueldo:");
Scanner teclado = new Scanner(System.in);
int s =teclado.nextInt();
if(s<300){
int r=s+100;
System.out.println("Su sueldo neto es:"+r);	
}else if(s>=300&&s<=400){
int r1=s+70;
System.out.println("Su sueldo neto es:"+r1);	
}else{
int r2=s+50;
System.out.println("Su sueldo neto es:"+r2);
}
}
}	

