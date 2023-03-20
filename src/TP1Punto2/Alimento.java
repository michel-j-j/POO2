package TP1Punto2;

public class Alimento {
	protected String nombre;
	private Float precio;

	public Alimento(String nombre, Float precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	Float obtenerPrecio() {
		return this.precio;
	}
}
