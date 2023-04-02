package utilitario;

import java.time.LocalDate;

import tp2punto2.Registrar;

public class EnBaseDeDatosRegistrar implements Registrar {

	private MesaJDBC mesaJDBC = new MesaJDBC(ConnectionManager.getProperties());
	private ParticipanteJDBC participanteJDBC = new ParticipanteJDBC(ConnectionManager.getProperties());

	@Override
	public void registrarParticipante(LocalDate fecha, Integer idParticipante, Integer idConcurso) {
		participanteJDBC.create(fecha, idParticipante, idConcurso);
	}

	@Override
	public void registarMesa(LocalDate fecha, Float importeTotal) {
		mesaJDBC.create(fecha, importeTotal);
	}
}
