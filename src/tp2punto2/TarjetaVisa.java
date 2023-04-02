package tp2punto2;

public class TarjetaVisa extends Tarjeta {

	public TarjetaVisa(Float saldo, Float descuento) throws Exception {
		super(saldo, descuento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aplicarDescuento(Pedido pedido) { // Tarjeta con descuento x
		Float precioBebida = pedido.calcularImporteBebida();
		Float precioPlato = pedido.calcularImportePlato();

		precioBebida = descontar(precioBebida);

		pedido.agregarImporteTotal(precioPlato + precioBebida);
	}
}
