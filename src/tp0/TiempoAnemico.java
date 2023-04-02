package tp0;

import java.time.LocalDate;

public class TiempoAnemico {

	private LocalDate fecha;

	public TiempoAnemico() {
		super();
		this.fecha = LocalDate.now();
	}

	public LocalDate getFecha() {
		return (this.fecha);
	}
}
