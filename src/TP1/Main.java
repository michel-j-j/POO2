package TP1;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		LocalDate fechaInicio = LocalDate.now();
		LocalDate fechaFin = LocalDate.of(2023, 3, 20);

		Concurso concurso = new Concurso(fechaInicio, fechaFin);

		Participante Juan = new Participante("Juan", 0);
		Juan.inscribirse(concurso);
		Juan.verPuntos();

		////////////////////////////////////////////////////////

		LocalDate fechaInicio2 = LocalDate.of(2023, 3, 6);
		LocalDate fechaFin2 = LocalDate.of(2023, 3, 14);

		Concurso concurso2 = new Concurso(fechaInicio2, fechaFin2);

		Participante Pedro = new Participante("Pedro", 0);
		Pedro.inscribirse(concurso2);
		Pedro.verPuntos();

	}

}
