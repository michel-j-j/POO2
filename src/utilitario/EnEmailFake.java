package utilitario;

import java.util.Objects;

import tp2punto2.Enviar;

public class EnEmailFake implements Enviar {
	private String emisor;
	private String receptor;
	private String usuario;
	private String contra;
	private String host;

	private Boolean enviado;

	public EnEmailFake(String emisor, String receptor, String usuario, String contra, String host) {

		this.emisor = Objects.requireNonNull(emisor);
		this.receptor = Objects.requireNonNull(receptor);
		this.usuario = Objects.requireNonNull(usuario);
		this.contra = Objects.requireNonNull(contra);
		this.host = Objects.requireNonNull(host);
	}

	@Override
	public void notificarConcurso(String titulo, String msj) {
		enviado = true;

	}

	public Boolean isEnviado() {
		return enviado;
	}

}
