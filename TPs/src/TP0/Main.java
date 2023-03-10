package TP0;

public class Main {

	public static void main(String[] args) {
		
		Tiempo nuevoTiempo = new Tiempo();
		
		nuevoTiempo.verFechaCompleta();
		nuevoTiempo.verFechaCorta();
		
		System.out.println("/////////////////////");
		
		TiempoAnemico nuevoTiempoAnemico = new TiempoAnemico();
		
		System.out.println(nuevoTiempoAnemico.getFechaCorta());
		System.out.println(nuevoTiempoAnemico.getFechaCompleta());
	}

}
