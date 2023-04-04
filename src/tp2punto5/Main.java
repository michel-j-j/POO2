package tp2punto5;

import java.time.LocalDate;

import tp2punto1.Concurso;
import tp2punto1.Participante;
import tp2punto2.Enviar;
import utilitario.EnEmailFake;

public class Main {

	public static void main(String[] args) throws Exception {

		LocalDate fechaInicio = LocalDate.of(2023, 3, 6);
		LocalDate fechaFin = LocalDate.of(2023, 4, 25);

		tp2punto2.Registrar registar = null;

		Enviar notificar = new EnEmailFake("from@example.com", "tom@example.com", "b78c9f4878db7f", "b4f74a52b601e4",
				"sandbox.smtp.mailtrap.io");

		Concurso concurso = new Concurso(fechaInicio, fechaFin, registar, notificar, 14);

		Participante pedro = new Participante("Pedro", 0, 3);

		pedro.inscribirse(concurso);

	}

}
