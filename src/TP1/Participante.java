package TP1;

public class Participante {
	private String nombre;
	private Integer punto;
	private Concurso concurso;

	public Participante(String nombre, Integer punto) {
		this.nombre = nombre;
		this.punto = punto;
	}

	public void sumarPuntos(Integer punto) {
		this.punto += punto;
	}

	public String obtenerNombre() {
		return (this.nombre);
	}

	public void inscribirse(Concurso concurso) {
		concurso.agregarParticipante(this);
	}
}
