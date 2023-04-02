package tp1punto1;

public class Participante {
	private String nombre;
	private Integer punto;
	private Concurso concurso = null;

	public Participante(String nombre, Integer punto) {
		this.nombre = nombre;
		this.punto = punto;
	}

	public void sumarPuntos(Integer punto) {
		this.punto += punto;
	}

	private String obtenerNombre() {
		return (this.nombre);
	}

	public Integer obtenerPuntos() {
		return (this.punto);
	}

	public void verPuntos() {
		System.out.println("La cantidad de puntos de " + obtenerNombre() + " es de: " + this.punto);
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
