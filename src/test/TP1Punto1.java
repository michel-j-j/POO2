package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import tp1punto1.Concurso;
import tp1punto1.Participante;

public class TP1Punto1 {

	@Test
	public void inscripcionFueraDeFecha() throws Exception {
		LocalDate fechaInicio = LocalDate.of(2023, 3, 10);
		LocalDate fechaFin = LocalDate.of(2023, 3, 14);

		Concurso concurso = new Concurso(fechaInicio, fechaFin);

		Participante Juan = new Participante("Juan", 0);

		Juan.inscribirse(concurso);
		Juan.verPuntos();

		assertEquals(0, Juan.obtenerPuntos());
	}

	@Test
	public void inscripcionEnFecha() throws Exception {
		LocalDate fechaInicio = LocalDate.of(2023, 3, 14);
		LocalDate fechaFin = LocalDate.of(2023, 3, 20);

		Concurso concurso = new Concurso(fechaInicio, fechaFin);

		Participante Juan = new Participante("Juan", 0);

		Juan.inscribirse(concurso);
		Juan.verPuntos();

		assertEquals(0, Juan.obtenerPuntos());
	}

	@Test
	public void inscripcionEnElPrimerDia() throws Exception {
		LocalDate fechaInicio = LocalDate.now();
		LocalDate fechaFin = LocalDate.of(2023, 3, 20);

		Concurso concurso = new Concurso(fechaInicio, fechaFin);

		Participante Juan = new Participante("Juan", 0);

		Juan.inscribirse(concurso);

		Juan.verPuntos();

		assertEquals(10, Juan.obtenerPuntos());
	}

}
