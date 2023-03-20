package TP1Punto2;

public class Comensal {

	private Integer id;
	private Tarjeta tarjeta;

	public Comensal(Integer id, Tarjeta tarjeta) {
		this.id = id;
		this.tarjeta = tarjeta;
	}

	Float descuento() {
		return tarjeta.obtenerDescuento();
	}

	Float pagar(Pedido pedido, Float propina) {
		tarjeta.aplicarDescuento(pedido);
		return tarjeta.pagar(propina, pedido.obtenerImporteTotla());
	}

}
