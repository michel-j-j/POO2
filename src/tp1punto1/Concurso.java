package tp1punto1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concurso {

	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private List<Participante> participantes;

	public Concurso(LocalDate fechaInicio, LocalDate fechaFin) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.participantes = new ArrayList<Participante>();
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

	public void agregarParticipante(Participante participante) throws Exception {
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
