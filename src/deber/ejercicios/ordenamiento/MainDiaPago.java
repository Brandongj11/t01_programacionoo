package deber.ejercicios.ordenamiento;

import java.util.Arrays;

public class MainDiaPago {

	public static void main(String[] args) {

		Empleado david = new Empleado();
		david.setNombre("David");
		david.setApellido("Arcos");
		david.setEdad(27);
		david.setSalario(250.50);

		Empleado ariel = new Empleado();
		ariel.setNombre("Ariel");
		ariel.setApellido("Velasco");
		ariel.setEdad(25);
		ariel.setSalario(150.70);

		Empleado daniel = new Empleado();
		daniel.setNombre("Daniel");
		daniel.setApellido("Vinueza");
		daniel.setEdad(26);
		daniel.setSalario(350.20);

		Empleado daniela = new Empleado();
		daniela.setNombre("Daniela");
		daniela.setApellido("Espin");
		daniela.setEdad(23);
		daniela.setSalario(400.50);

		Empleado cristian = new Empleado();
		cristian.setNombre("Cristian");
		cristian.setApellido("Tipan");
		cristian.setEdad(30);
		cristian.setSalario(100.20);

		Empleado fabian = new Empleado();
		fabian.setNombre("Fabian");
		fabian.setApellido("Villamarin");
		fabian.setEdad(45);
		fabian.setSalario(525.60);

		Empleado jhon = new Empleado();
		jhon.setNombre("Jhon");
		jhon.setApellido("Teran");
		jhon.setEdad(26);
		jhon.setSalario(310.20);

		Empleado felix = new Empleado();
		felix.setNombre("Felix");
		felix.setApellido("Jaguaco");
		felix.setEdad(31);
		felix.setSalario(210.30);

		Empleado leonidas = new Empleado();
		leonidas.setNombre("Leonidas");
		leonidas.setApellido("Vega");
		leonidas.setEdad(35);
		leonidas.setSalario(150.60);

		Empleado luis = new Empleado();
		luis.setNombre("Luis");
		luis.setApellido("Escobar");
		luis.setEdad(45);
		luis.setSalario(160.90);

		Empleado nominaEmpleados[] = new Empleado[10];
		nominaEmpleados[0] = david;
		nominaEmpleados[1] = ariel;
		nominaEmpleados[2] = daniel;
		nominaEmpleados[3] = daniela;
		nominaEmpleados[4] = cristian;
		nominaEmpleados[5] = fabian;
		nominaEmpleados[6] = jhon;
		nominaEmpleados[7] = felix;
		nominaEmpleados[8] = leonidas;
		nominaEmpleados[9] = luis;

		Arrays.sort(nominaEmpleados);
		System.out.println("Empleados ordenados segun el valor de su salario");
		System.out.println(Arrays.toString(nominaEmpleados));

	}

}
