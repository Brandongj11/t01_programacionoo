package ejercicios.ordenamiento;

import java.util.Arrays;

public class MainPrimerClase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 primer dia de clase
		// El profesor nos da nuestro número lista

		Estudiante danilo = new Estudiante();
		danilo.setNombre("Danilo");
		danilo.setNumeroLista(1);
		danilo.setApellido("Gonzales");
		danilo.setEdad(22);

		Estudiante andres = new Estudiante();
		andres.setNombre("Andres");
		andres.setNumeroLista(2);
		andres.setApellido("Alvarez");
		andres.setEdad(17);

		Estudiante alex = new Estudiante();
		alex.setNombre("Alex");
		alex.setNumeroLista(22);
		alex.setApellido("Gonzales");
		alex.setEdad(18);

		Estudiante stefany = new Estudiante();
		stefany.setNombre("Stefany");
		stefany.setNumeroLista(10);
		stefany.setApellido("Cruz");
		stefany.setEdad(26);

		Estudiante jhonny = new Estudiante();
		jhonny.setNombre("Jhonny");
		jhonny.setNumeroLista(21);
		jhonny.setApellido("Suarez");
		jhonny.setEdad(24);

		// Alex dame tu nuemro de lista
		System.out.println("Inge mi edad es: " + alex.getEdad());
		System.out.println("Inge mi edad es: " + jhonny.getEdad());

		Estudiante listaEstudiantes[] = new Estudiante[5];
		listaEstudiantes[0] = danilo;
		listaEstudiantes[1] = andres;
		listaEstudiantes[2] = alex;
		listaEstudiantes[3] = stefany;
		listaEstudiantes[4] = jhonny;
		// Vector antes de ordenar
		System.out.println("Estudiantes antes de ordenar");
		System.out.println(Arrays.toString(listaEstudiantes));
		// Aqui ordeno la lista
		Arrays.sort(listaEstudiantes);
		System.out.println("Estudiantes despues de ordenar");
		System.out.println(Arrays.toString(listaEstudiantes));
	}
}
		
