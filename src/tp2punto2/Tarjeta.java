package tp2punto2;

public class Tarjeta {

	private Float saldo;
	private Float descuento;

	public Tarjeta(Float saldo, Float descuento) throws Exception {
		if (!validar(saldo, descuento))
			throw new Exception("ingrese valores positivos.");

		this.saldo = saldo;
		this.descuento = descuento;
	}

	private Boolean validar(Float saldo, Float descuento) {
		return (saldo >= 0) && (descuento >= 0);
	}

	protected Float descontar(Float importe) {
		return importe * (1 - this.descuento / 100);
	}

	public void aplicarDescuento(Pedido pedido) { // Tarjeta sin descuento
		Float precioPlato = pedido.calcularImportePlato();
		Float precioBebida = pedido.calcularImporteBebida();

		pedido.agregarImporteTotal(precioPlato + precioBebida);
	}

	public Float obtenerDescuento() {
		return this.descuento;
	}

	public Float pagar(Float propina, Float total) {
		propina = propina / 100;
		total = total * (1 + propina);

		return total;
	}
}
