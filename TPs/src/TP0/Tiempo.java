package TP0;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Tiempo {

	private Date fecha;

	
	public Tiempo() {
		super();
		this.fecha = fechaActual();
	}
	
	private Date fechaActual()
	{  
		return(Calendar.getInstance().getTime());
	}
	
	public Date getFecha()
	{
		return(this.fecha);
	}
	
	private void impirmirFecha(String format)
	{
		String pattern = format;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(fechaActual());
		System.out.println(date);
	}

	public void verFechaCompleta()
	{
		String pattern = "EEEEE dd MMMM yyyy";
		impirmirFecha(pattern);
		
	}
	public void verFechaCorta()
	{
		String pattern = "dd/MM/yyyy";
		impirmirFecha(pattern);
	}
	
	/*
	 * Luego, implemente una clase Tiempo y una clase Main (la cual instancia y utiliza la clase
Tiempo), que impriman por consola (sysout), la fecha/hora de hoy en dos formatos diferentes:
Largo, del tipo “Lunes 3 de Abril de 2020”. Y otro en formato corto del tipo: “03/04/2020”
	 */
}
