package TP2Punto2;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private List<Plato> platos;
	private List<Bebida> bebidas;
	private Float importeTotal;

	Pedido(ArrayList<Plato> platos, ArrayList<Bebida> bebidas) {
		this.platos = platos;
		this.bebidas = bebidas;
	}

	float calcularImporteBebida() {
		float total = 0;
		for (Plato plato : platos) {
			total += plato.obtenerPrecio();
		}
		return total;
	}

	float calcularImportePlato() {
		float total = 0;
		for (Bebida bebida : bebidas) {
			total += bebida.obtenerPrecio();
		}
		return total;
	}

	void agregarImporteTotal(Float importeTotal) {
		this.importeTotal = importeTotal;
	}

	float obtenerImporteTotla() {
		return this.importeTotal;
	}

}
