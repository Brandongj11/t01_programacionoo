package programa.ajedrez;

public class Rey extends Pieza {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Rey [nombre=" + nombre + "]";
	}

}
