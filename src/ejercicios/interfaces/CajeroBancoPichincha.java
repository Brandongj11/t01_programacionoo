package ejercicios.interfaces;

public class CajeroBancoPichincha implements CajeroInterfaz {

	@Override
	public void solicitarTarjeta(String numero) {
		System.out.println("Su numero de tarjeta es:");

	}

	@Override
	public void solicitarClave(String clave) {
		System.out.println("Ingrese su clave:");

	}

	@Override
	public void solicitarTipoTransaccion() {
		System.out.println("Cual es el tipo de transaccion que necesita:");

	}

	@Override
	public void solicitarMonto(int monto) {
		System.out.println("Ingrese el monto:");

	}

	@Override
	public void validarElSaldo() {
		System.out.println("Estamos validando su saldo:");

	}

	@Override
	public void entregarDinero() {
		System.out.println("Su numero de tarjeta es:");

	}

	@Override
	public void realizarLaTransaccion() {
		System.out.println("Su transaccion esta realizada:");

	}

	@Override
	public void entregarRecibo() {
		System.out.println("Su recibo esta listo:");

	}

}