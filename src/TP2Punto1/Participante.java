package TP2Punto1;

public class Participante {
	private Integer id;
	private String nombre;
	private Integer punto;
	private Concurso concurso = null;

	public Participante(String nombre, Integer punto, Integer id) {
		this.nombre = nombre;
		this.punto = punto;
		this.id = id;
	}

	public void sumarPuntos(Integer punto) {
		this.punto += punto;
	}

	public Integer obtenerId() {
		return this.id;
	}

	public Integer obtenerPuntos() {
		return (this.punto);
	}

	public void inscribirse(Concurso concurso) throws Exception {
		if (this.concurso == null) {
			this.concurso = concurso;
			concurso.agregarParticipante(this);
		} else {
			concurso.agregarParticipante(this);
		}

	}
}
