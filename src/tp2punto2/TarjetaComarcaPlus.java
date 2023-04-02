package tp2punto2;

public class TarjetaComarcaPlus extends Tarjeta {

	public TarjetaComarcaPlus(Float saldo, Float descuento) throws Exception {
		super(saldo, descuento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aplicarDescuento(Pedido pedido) { // Tarjeta con descuento x

		Float precioBebida = pedido.calcularImporteBebida();
		Float precioPlato = pedido.calcularImportePlato();

		Float total = descontar(precioPlato + precioBebida);

		pedido.agregarImporteTotal(total);
	}

}
