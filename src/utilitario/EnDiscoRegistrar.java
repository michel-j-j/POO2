package utilitario;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.time.LocalDate;

import tp2punto2.Registrar;

public class EnDiscoRegistrar implements Registrar {

	private String dir;

	public EnDiscoRegistrar(String dir) {
		this.dir = dir;
	}

	@Override
	public void registrarParticipante(LocalDate fecha, Integer idParticipante, Integer idConcurso) throws IOException {
		try {
			escribirEnDisco(fecha + " || " + idParticipante + " || " + idConcurso);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void escribirEnDisco(String txt) throws IOException {
		FileOutputStream f;
		try {
			// C:\\Users\\michi\\OneDrive\\Documentos\\txt\\archivo.txt

			FileOutputStream is = new FileOutputStream(this.dir);
			OutputStreamWriter osw = new OutputStreamWriter(is);
			Writer w = new BufferedWriter(osw);
			w.write(txt);
			w.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void registarMesa(LocalDate fecha, Float importeTotal) throws IOException {
		try {
			escribirEnDisco(fecha + " || " + importeTotal);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
