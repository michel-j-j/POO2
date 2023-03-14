package Utilitario;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataHealper {
	
	private static Date fechaActual()
	{  
		return(Calendar.getInstance().getTime());
	}
	
	private static String impirmirFecha(String format)
	{
		String pattern = format;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(fechaActual());
		return(date);
	}

	public static String  verFechaCompleta()
	{
		String pattern = "EEEEE dd MMMM yyyy";
		return(impirmirFecha(pattern));
		
		
	}
	public static String verFechaCorta()
	{
		String pattern = "dd/MM/yyyy";
		return(impirmirFecha(pattern));
	}
}
