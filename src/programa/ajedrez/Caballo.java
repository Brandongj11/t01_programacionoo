package programa.ajedrez;

public class Caballo extends Pieza {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Caballo [nombre=" + nombre + "]";
	}

}