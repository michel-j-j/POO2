package TP0;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {

		Tiempo nuevoTiempo = new Tiempo();

		nuevoTiempo.verFechaCompleta();

		nuevoTiempo.verFechaCorta();

		System.out.println("/////////////////////");

		TiempoAnemico nuevoTiempoAnemico = new TiempoAnemico();

		// Fecha Completa
		System.out.println(DateTimeFormatter.ofPattern("dd-MM-yyyy").format(nuevoTiempoAnemico.getFecha()));
		// Fecha Corta
		System.out.println(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy ").format(nuevoTiempoAnemico.getFecha()));

		System.out.println("/////////////////////");

		TiempoRecord tiempoRecord = new TiempoRecord(LocalDate.now());

		// Fecha Completa
		System.out.println(DateTimeFormatter.ofPattern("dd-MM-yyyy").format(tiempoRecord.fecha()));
		// Fecha Corta
		System.out.println(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy ").format(tiempoRecord.fecha()));

	}

}
