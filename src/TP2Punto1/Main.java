package TP2Punto1;

import java.time.LocalDate;

import TP2Punto2.Enviar;
import Utilitario.EnBaseDeDatosRegistrar;
import Utilitario.EnEmail;
import Utilitario.EnEmailFake;

public class Main {

	public static void main(String[] args) throws Exception {

		LocalDate fechaInicio = LocalDate.of(2023, 3, 6);
		LocalDate fechaFin = LocalDate.of(2023, 4, 25);

		// Registrar registar = new
		// EnDiscoRegistrar("C:\\Users\\michi\\OneDrive\\Escritorio");

		// Punto 3
		TP2Punto2.Registrar registar = new EnBaseDeDatosRegistrar();
		// Punto 4
		Enviar notificar = new EnEmail("from@example.com", "tom@example.com", "b78c9f4878db7f", "b4f74a52b601e4",
				"sandbox.smtp.mailtrap.io");

		// Punto 5
		notificar = new EnEmailFake("from@example.com", "tom@example.com", "b78c9f4878db7f", "b4f74a52b601e4",
				"sandbox.smtp.mailtrap.io");
		Concurso concurso = new Concurso(fechaInicio, fechaFin, registar, notificar, 14);

		Participante pedro = new Participante("Pedro", 0, 3);

		pedro.inscribirse(concurso);

	}

}
