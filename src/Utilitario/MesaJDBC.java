package Utilitario;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Properties;

import com.mysql.jdbc.CommunicationsException;
import com.mysql.jdbc.Statement;

public class MesaJDBC {
	private Properties prop;

	public MesaJDBC(Properties prop) {
		this.prop = Objects.requireNonNull(prop);
	}

	private Connection establecerConexion() throws SQLException {
		return DriverManager.getConnection(prop.getProperty("connection"), prop.getProperty("username"),
				prop.getProperty("password"));
	}

	public void create(LocalDate fecha, Float importeTotal) {
		try {
			Connection conn = establecerConexion();
			PreparedStatement statement = conn.prepareStatement("INSERT INTO mesa(fecha, importe) " + " VALUES (?, ?)",
					Statement.RETURN_GENERATED_KEYS);

			Date date = Date.valueOf(fecha);

			statement.setDate(1, date);
			statement.setFloat(2, importeTotal);

			if (statement.executeUpdate() < 0)
				throw new RuntimeException("No anduvo");

		} catch (CommunicationsException e) {
			throw new RuntimeException("Error en la conexion con la base");
		} catch (SQLException e) {
			throw new RuntimeException("Error al procesar la consulta");

		} catch (Exception e) {
			throw new RuntimeException("Error en la creacion del mapa");
		}
	}
}
