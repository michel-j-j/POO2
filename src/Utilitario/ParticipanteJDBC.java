package Utilitario;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Properties;

import com.mysql.jdbc.Statement;

public class ParticipanteJDBC {

	public void create(LocalDate fecha, Integer idConcurso, Integer idParticipante) { // TERMINADO
		Properties prop = ConnectionManager.getProperties();
		try (Connection conn = DriverManager.getConnection(prop.getProperty("connection"), prop.getProperty("username"),
				prop.getProperty("password"));

				PreparedStatement statement = conn.prepareStatement(
						"INSERT INTO participante(fecha, id_concurso, id_participante) " + " VALUES (?, ?,?)",
						Statement.RETURN_GENERATED_KEYS)) {

			Date date = Date.valueOf(fecha);

			statement.setDate(1, date);
			statement.setInt(2, idConcurso);
			statement.setInt(3, idParticipante);

			Integer anduvo = statement.executeUpdate();

			if (anduvo > 0) {
				ResultSet rs = statement.getGeneratedKeys();
				rs.next();
				System.out.println("Se agrego " + anduvo + " registros");

			} else {
				System.out.println("Error al actualizar");
			}

		} catch (SQLException e) {
			System.out.println("Error al procesar consulta" + e);

		} catch (Exception e) {
			System.out.println("Error en la creacion del mapa");
		}

	}
}
