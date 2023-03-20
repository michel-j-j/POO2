package TP1Punto1;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws Exception {

		LocalDate fechaInicio = LocalDate.now();
		LocalDate fechaFin = LocalDate.of(2023, 3, 20);

		Concurso concurso = new Concurso(fechaInicio, fechaFin);

		Participante juan = new Participante("Juan", 0);
		juan.inscribirse(concurso);
		juan.verPuntos();

		////////////////////////////////////////////////////////

		LocalDate fechaInicio2 = LocalDate.of(2023, 3, 6);
		LocalDate fechaFin2 = LocalDate.of(2023, 3, 14);

		Concurso concurso2 = new Concurso(fechaInicio2, fechaFin2);

		Participante pedro = new Participante("Pedro", 0);
		pedro.inscribirse(concurso2);
		pedro.verPuntos();

	}

}
