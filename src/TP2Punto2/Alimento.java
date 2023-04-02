package TP2Punto2;

import java.util.Objects;

public class Alimento {
	protected String nombre;
	private Float precio;

	public Alimento(String nombre, Float precio) {
		this.nombre = Objects.requireNonNull(nombre);
		this.precio = Objects.requireNonNull(precio);
	}

	Float obtenerPrecio() {
		return this.precio;
	}
}
