package TP0;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//LocalDate por Date. 
public class Tiempo {

	private LocalDate fecha;

	public Tiempo() {
		super();
		this.fecha = fechaActual();
	}

	private LocalDate fechaActual() {
		return (LocalDate.now());
	}

	public void verFechaCompleta() {
		System.out.println(DateTimeFormatter.ofPattern("dd-MM-yyyy").format(fecha));

	}

	public void verFechaCorta() {
		System.out.println(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy ").format(fecha));
	}

	/*
	 * Luego, implemente una clase Tiempo y una clase Main (la cual instancia y
	 * utiliza la clase Tiempo), que impriman por consola (sysout), la fecha/hora de
	 * hoy en dos formatos diferentes: Largo, del tipo “Lunes 3 de Abril de 2020”. Y
	 * otro en formato corto del tipo: “03/04/2020”
	 * 
	 */
}
