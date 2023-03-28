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

public class MesaJDBC {
	public void create(LocalDate fecha, Float importeTotal) {
		Properties prop = ConnectionManager.getProperties();
		try (Connection conn = DriverManager.getConnection(prop.getProperty("connection"), prop.getProperty("username"),
				prop.getProperty("password"));

				PreparedStatement statement = conn.prepareStatement(
						"INSERT INTO mesa(fecha, importe) " + " VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS)) {

			Date date = Date.valueOf(fecha);
			System.out.println(date);
			statement.setDate(1, date);
			statement.setFloat(2, importeTotal);

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
