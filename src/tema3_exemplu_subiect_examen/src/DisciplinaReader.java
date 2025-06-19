package tema3_exemplu_subiect_examen.src;

import java.io.*;
import java.util.*;

public class DisciplinaReader {
    public static List<Disciplina> citesteDiscipline(String path) {
        List<Disciplina> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0].trim());
                    String denumire = parts[1].trim();
                    String tip = parts[2].trim();
                    lista.add(new Disciplina(id, denumire, tip));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
