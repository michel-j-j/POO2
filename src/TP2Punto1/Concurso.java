package TP2Punto1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import TP2Punto2.Enviar;

public class Concurso { // RunnTimeException

	private Integer id;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private List<Participante> participantes;
	private TP2Punto2.Registrar planilla;
	private Enviar notificar;

	public Concurso(LocalDate fechaInicio, LocalDate fechaFin, TP2Punto2.Registrar planilla, Enviar notificar,
			Integer id) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.participantes = new ArrayList<Participante>();
		this.planilla = planilla;
		this.id = id;
		this.notificar = notificar;

	}

	private Boolean fechaHabil() throws Exception {
		LocalDate hoy = LocalDate.now();
		if ((hoy.isAfter(fechaInicio) || hoy.equals(fechaInicio)) && hoy.isBefore(fechaFin)) {
			return true;
		} else {
			throw new Exception("Fuera de fecha!");

		}
	}

	private Boolean primerDia() {
		LocalDate hoy = LocalDate.now();
		return fechaInicio.equals(hoy);
	}

	private Integer obtenerId() {
		return this.id;
	}

	public void agregarParticipante(Participante participante) throws Exception {
		if (!estaInscripto(participante) && fechaHabil()) {
			if (primerDia())
				participante.sumarPuntos(10);

			this.participantes.add(participante);
			// Registrar
			// this.planilla.registrarParticipante(LocalDate.now(),
			// participante.obtenerId(), this.obtenerId());
			this.notificar.notificarConcurso("Concurso:" + this.obtenerId(),
					"Se cargo el participante " + participante.obtenerId() + " en la fecha " + LocalDate.now());
		}

	}

	private Boolean estaInscripto(Participante participante) {

		return this.participantes.stream().anyMatch(p -> participante.equals(p));
	}

}
