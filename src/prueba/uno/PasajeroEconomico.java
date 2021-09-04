package prueba.uno;

public class PasajeroEconomico extends Pasajero {
	private String codigoDescuento;

	public PasajeroEconomico(String nombre, String apellido, String codigoMembresia, int edad) {
	}

	public PasajeroEconomico() {

	}

//Metodos SET Y GET
	public String getCodigoDescuento() {
		return codigoDescuento;
	}

	public void setCodigoDescuento(String codigoDescuento) {
		this.codigoDescuento = codigoDescuento;
	}

	@Override
	public String toString() {
		return "PasajeroEconomico= "+this.nombre+"codigoDescuento=" + codigoDescuento + "";
	}
	
}
