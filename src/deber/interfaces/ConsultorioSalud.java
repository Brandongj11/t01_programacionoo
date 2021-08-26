package deber.interfaces;

public class ConsultorioSalud implements ConsultorioInterfaz {

	public void agendarCita(String fecha) {
		System.out.println("Su cita esta lista");
	}

	public void acudirCita() {
		System.out.println("Va a la cita antes mencionada");
	}

	public void registrarDatos(String datos) {
		System.out.println("Ingreso de datos personales del paciente");
	}

	public void realizarDiagnostico() {
		System.out.println("Le informan su diagnostico");
	}

	public void enviarMedicamento() {
		System.out.println("Se envia la receta con los medicamentos que necesita el paciente");
	}

}
