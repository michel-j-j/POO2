package TP1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class ClassTesting {

	@Test
	public void inscripcionFueraDeFecha() {
		LocalDate fechaInicio = LocalDate.of(2023, 3, 10);
		LocalDate fechaFin = LocalDate.of(2023, 3, 14);

		Concurso concurso = new Concurso(fechaInicio, fechaFin);

		Participante Juan = new Participante("Juan", 0);

		Juan.inscribirse(concurso);

		assertEquals(0, Juan.obtenerPuntos());
	}

	@Test
	public void inscripcionEnFecha() {
		LocalDate fechaInicio = LocalDate.now();
		LocalDate fechaFin = LocalDate.of(2023, 3, 20);

		Concurso concurso = new Concurso(fechaInicio, fechaFin);

		Participante Juan = new Participante("Juan", 0);

		Juan.inscribirse(concurso);

		assertEquals(10, Juan.obtenerPuntos());
	}

}
