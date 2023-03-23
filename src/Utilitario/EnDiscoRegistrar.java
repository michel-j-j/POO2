package Utilitario;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.time.LocalDate;

import TP2Punto1.Registrar;

public class EnDiscoRegistrar implements Registrar {

	private String dir;

	public EnDiscoRegistrar(String dir) {
		this.dir = dir;
	}

	@Override
	public void registrarParticipante(LocalDate fecha, Integer idParticipante, Integer idConcurso) throws IOException {
		FileOutputStream f;
		try {
			// C:\\Users\\michi\\OneDrive\\Documentos\\txt\\archivo.txt

			FileOutputStream is = new FileOutputStream(
					"C:\\\\Users\\\\michi\\\\OneDrive\\\\Documentos\\\\txt\\\\archivo.txt");
			OutputStreamWriter osw = new OutputStreamWriter(is);
			Writer w = new BufferedWriter(osw);
			w.write(fecha + " || " + idParticipante + " || " + idConcurso);
			w.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
