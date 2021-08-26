package deber.interfaces;

public class MatriculaInstituto implements MatriculaInterfaz {

	public void ingresarCedula(String cedula) {
		System.out.println("Ingrese el numero de cedula del estudiante");
	}

	public void revisarDatos(String datos) {
		System.out.println("Revisar que los datos sean los correctos ");
	}

	public void validarMaterias() {
		System.out.println("Validar que todas las materias esten aprobadas");
	}

	public void realizarPago() {
		System.out.println("Pagar el valor de la matricula");
	}

	public void imprimirComprobante() {
		System.out.println("Imprimir el comprobante de pago de la matricula");
	}

}
