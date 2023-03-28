package Utilitario;

import java.io.IOException;
import java.time.LocalDate;

import TP2Punto2.Registrar;

public class EnBaseDeDatosRegistrar implements Registrar {

	private MesaJDBC mesaJDBC = new MesaJDBC();
	private ParticipanteJDBC participanteJDBC = new ParticipanteJDBC();

	@Override
	public void registrarParticipante(LocalDate fecha, Integer idParticipante, Integer idConcurso) throws IOException {

		try {
			participanteJDBC.create(fecha, idParticipante, idConcurso);
			System.out.println("Aca");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void registarMesa(LocalDate fecha, Float importeTotal) throws IOException {
		mesaJDBC.create(fecha, importeTotal);
	}
}
