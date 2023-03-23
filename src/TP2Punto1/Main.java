package TP2Punto1;

import java.time.LocalDate;

import Utilitario.EnDiscoRegistrar;

public class Main {

	public static void main(String[] args) throws Exception {

		LocalDate fechaInicio = LocalDate.of(2023, 3, 6);
		LocalDate fechaFin = LocalDate.of(2023, 3, 25);

		Registrar registar = new EnDiscoRegistrar("C:\\Users\\michi\\OneDrive\\Escritorio");

		Concurso concurso = new Concurso(fechaInicio, fechaFin, registar, 14);

		Participante pedro = new Participante("Pedro", 0, 3);

		pedro.inscribirse(concurso);

	}

}
