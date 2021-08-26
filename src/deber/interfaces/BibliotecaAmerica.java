package deber.interfaces;

public class BibliotecaAmerica implements BibliotecaInterfaz {

	public void buscarLibro(String nombre) {
		System.out.println("Busque el libro que desea leer");
	}

	public void presentarCredencial(String credencial) {
		System.out.println("Muestre su credencial");
	}

	public void registrarPrestamo() {
		System.out.println("El libro sera prestado hasta la fecha indicada");
	}

	public void retiroLibro() {
		System.out.println("Puede llevarse el libro");
	}

	public void revisarLibro() {
		System.out.println("Leer el libro seleccionado");
	}

}
