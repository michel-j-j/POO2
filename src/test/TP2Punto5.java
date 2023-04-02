package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import tp2punto1.Concurso;
import tp2punto1.Participante;
import tp2punto2.Enviar;
import utilitario.EnBaseDeDatosRegistrar;
import utilitario.EnEmailFake;

public class TP2Punto5 {

	@Test
	public void inscribirseConcursoYNotificar() throws Exception {
		LocalDate fechaInicio = LocalDate.now();
		LocalDate fechaFin = LocalDate.of(2023, 4, 25);

		// Registrar registar = new
		// EnDiscoRegistrar("C:\\Users\\michi\\OneDrive\\Escritorio");

		// Punto 3
		tp2punto2.Registrar registar = new EnBaseDeDatosRegistrar();
		// Punto 4
		// Enviar notificar = new EnEmail("from@example.com", "tom@example.com",
		// "b78c9f4878db7f", "b4f74a52b601e4",
		// "sandbox.smtp.mailtrap.io");

		// Punto 5
		Enviar notificar = new EnEmailFake("from@example.com", "tom@example.com", "b78c9f4878db7f", "b4f74a52b601e4",
				"sandbox.smtp.mailtrap.io");
		Concurso concurso = new Concurso(fechaInicio, fechaFin, registar, notificar, 14);

		Participante pedro = new Participante("Pedro", 0, 3);

		pedro.inscribirse(concurso);

		assertEquals(true, notificar.isEnviado());

	}
}
