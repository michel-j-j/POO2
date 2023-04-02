package tp1punto2;

public class TarjetaMasterCard extends Tarjeta {

	public TarjetaMasterCard(Float saldo, Float descuento) throws Exception {
		super(saldo, descuento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aplicarDescuento(Pedido pedido) { // Tarjeta con descuento x
		Float precioBebida = pedido.calcularImporteBebida();
		Float precioPlato = pedido.calcularImportePlato();

		precioPlato = descontar(precioPlato);

		pedido.agregarImporteTotal(precioPlato + precioBebida);
	}

}
