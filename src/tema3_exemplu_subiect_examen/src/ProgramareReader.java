package tema3_exemplu_subiect_examen.src;

import java.sql.*;
import java.util.*;

public class ProgramareReader {
    public static List<Programare> citesteProgramari(String dbPath) {
        List<Programare> lista = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:" + dbPath)) {
             String sql = "select * from Programari";
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql);
             while (rs.next()) {
                 lista.add(new Programare(
                         rs.getString("Zi"),
                         rs.getString("Interval"),
                         rs.getString("Sala"),
                         rs.getString("Tip"),
                         rs.getString("Formatie"),
                         rs.getInt("idDisciplina")
                 ));
             }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
