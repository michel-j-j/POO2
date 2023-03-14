package TP1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concurso {

	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private List<Participante> participantes;

	private Boolean fechaHabil() {
		LocalDate hoy = LocalDate.now();
		if ((hoy.isAfter(fechaInicio)) && (hoy.isBefore(fechaFin))) {
			return (true);
		} else {
			System.out.println("Fuera de fecha!");
			return (false);
		}
	}

	private Boolean primerDia() {
		LocalDate hoy = LocalDate.now();
		return (fechaInicio.equals(hoy));
	}

	public Concurso(LocalDate fechaInicio, LocalDate fechaFin) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.participantes = new ArrayList<Participante>();
	}

	public void agregarParticipante(Participante participante) {
		if (!estaInscripto(participante) && fechaHabil()) {
			if (primerDia())
				participante.sumarPuntos(10);
			this.participantes.add(participante);
		}

	}

	private Boolean estaInscripto(Participante participante) {
		return (this.participantes.stream().anyMatch(p -> participante.equals(p)));
	}

}