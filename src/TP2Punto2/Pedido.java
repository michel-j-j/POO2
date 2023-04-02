package TP2Punto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pedido {
	private List<Plato> platos;
	private List<Bebida> bebidas;
	private Float importeTotal;

	Pedido(ArrayList<Plato> platos, ArrayList<Bebida> bebidas) {
		this.platos = Objects.requireNonNull(platos);
		this.bebidas = Objects.requireNonNull(bebidas);
	}

	float calcularImporteBebida() {
		return (float) bebidas.stream().mapToDouble(Bebida::obtenerPrecio).sum();

	}

	float calcularImportePlato() {
		return (float) platos.stream().mapToDouble(Plato::obtenerPrecio).sum();
	}

	void agregarImporteTotal(Float importeTotal) {
		this.importeTotal = Objects.requireNonNull(importeTotal);
	}

	float obtenerImporteTotla() {
		return this.importeTotal;
	}

}
