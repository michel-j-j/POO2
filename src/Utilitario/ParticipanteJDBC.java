package Utilitario;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Properties;

import com.mysql.jdbc.Statement;

public class ParticipanteJDBC {

	private Properties prop;

	public ParticipanteJDBC(Properties prop) {
		this.prop = Objects.requireNonNull(prop);
	}

	private Connection establecerConexion() throws SQLException {
		return DriverManager.getConnection(prop.getProperty("connection"), prop.getProperty("username"),
				prop.getProperty("password"));
	}

	public void create(LocalDate fecha, Integer idConcurso, Integer idParticipante) { // TERMINADO

		try {
			Connection conn = establecerConexion();
			PreparedStatement statement = conn.prepareStatement(
					"INSERT INTO participante(fecha, id_concurso, id_participante) " + " VALUES (?, ?,?)",
					Statement.RETURN_GENERATED_KEYS);

			Date date = Date.valueOf(fecha);

			statement.setDate(1, date);
			statement.setInt(2, idConcurso);
			statement.setInt(3, idParticipante);

			if (statement.executeUpdate() < 0)
				throw new RuntimeException("No anduvo");

		} catch (SQLException e) {
			throw new RuntimeException("Error al procesar la consulta");

		} catch (Exception e) {
			throw new RuntimeException("Error en la creacion del mapa");
		}

	}
}
