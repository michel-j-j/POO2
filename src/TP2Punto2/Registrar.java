package TP2Punto2;

import java.io.IOException;
import java.time.LocalDate;

public interface Registrar {
	void registrarParticipante(LocalDate fecha, Integer idParticipante, Integer idConcurso) throws IOException;

	void registarMesa(LocalDate fecha, Float importeTotal) throws IOException;
}
