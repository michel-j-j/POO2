package TP1Punto2;

public class Tarjeta {

	private Float saldo;
	private Float descuento;

	public Tarjeta(Float saldo, Float descuento) throws Exception {
		if (validar(saldo, descuento)) {
			this.saldo = saldo;
			this.descuento = descuento;

		} else {
			throw new Exception("ingrese valores positivos. ");
		}
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
		return (this.descuento);
	}

	public Float pagar(Float propina, Float total) {
		try {
			propina = propina / 100;
			total = total * (1 + propina);
		} catch (Exception e) {
			System.out.println(e.getMessage() + this.getClass());
		}
		return total;
	}
}
