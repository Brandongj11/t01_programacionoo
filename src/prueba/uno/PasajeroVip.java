package prueba.uno;

public class PasajeroVip extends Pasajero {
	private String codigoMembresia;

	public PasajeroVip(String nombre, String apellido, String codigoMembresia, int edad) {
	}

	public PasajeroVip() {
	
	}

	public String getCodigoMembresia() {
		return codigoMembresia;
	}

	public void setCodigoMembresia(String codigoMembresia) {
		this.codigoMembresia = codigoMembresia;
	}

	@Override
	public String toString() {
		return "PasajeroVip= " +this.nombre+ " codigoMembresia= " + codigoMembresia + "";
	}
	
}
