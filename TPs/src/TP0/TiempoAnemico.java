package TP0;

import java.util.Date;

import Utilitario.DataHealper;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TiempoAnemico {

	private Date fecha;

	
	public TiempoAnemico() {
		super();
		this.fecha = new Date();
	}
	
	public String getFechaCorta()
	{
		return(DataHealper.verFechaCorta());
	}
	
	public String getFechaCompleta()
	{
		return(DataHealper.verFechaCompleta());
	}

}
