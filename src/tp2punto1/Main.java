package tp2punto1;

import java.time.LocalDate;

import utilitario.EnDiscoRegistrar;

public class Main {

	public static void main(String[] args) throws Exception {

		LocalDate fechaInicio = LocalDate.of(2023, 3, 6);
		LocalDate fechaFin = LocalDate.of(2023, 4, 25);

		tp2punto2.Registrar registar = new EnDiscoRegistrar("C:\\Users\\michi\\OneDrive\\Escritorio");

		Concurso concurso = new Concurso(fechaInicio, fechaFin, registar, null, 14);

		Participante pedro = new Participante("Pedro", 0, 3);

		pedro.inscribirse(concurso);

	}

}
