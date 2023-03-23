package TP2Punto1;

import java.io.IOException;
import java.time.LocalDate;

public interface Registrar {
	void registrarParticipante(LocalDate fecha, Integer idParticipante, Integer idConcurso) throws IOException;
}
