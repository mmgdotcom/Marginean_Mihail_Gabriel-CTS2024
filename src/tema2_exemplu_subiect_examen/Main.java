package tema2_exemplu_subiect_examen;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;


public class Main {
    public static List<Produs> citesteProduse(String filespath) throws IOException{
        List<Produs> produse = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filespath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            int cod = Integer.parseInt(parts[0].trim());
            String denumire = parts[1].trim();
            double pret = Double.parseDouble(parts[2].trim());
            produse.add(new Produs(cod, denumire, pret));
        }
        reader.close();
        return produse;
    }

    public static List<Tranzactie> citesteTranzactii (String filepath) throws IOException {
        List<Tranzactie> tranzactii = new ArrayList<>();
        String content = new String(Files.readAllBytes(Paths.get(filepath)));
        JSONArray jsonArray = new JSONArray(content);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            int codProdus = obj.getInt("codProdus");
            int cantitate = obj.getInt("cantitate");
            String tip = obj.getString("tip");

            tranzactii.add(new Tranzactie(codProdus, cantitate, tip));
        }
        return tranzactii;
    }

    public static void scrieRaport(List<Produs> produse, List<Tranzactie> tranzactii, String outputhPath) throws IOException {
        Map<Integer, Integer> tranzactiiPerProdus = new HashMap<>();

        for (Tranzactie t : tranzactii) {
            tranzactiiPerProdus.put(t.getCodProdus(), tranzactiiPerProdus.getOrDefault(t.getCodProdus(), 0) + 1);
        }

        List<Map.Entry<Produs, Integer>> raport = new ArrayList<>();
        for (Produs p : produse) {
            int nrTranzactii = tranzactiiPerProdus.getOrDefault(p.getCodProdus(), 0);
            raport.add(new AbstractMap.SimpleEntry<>(p, nrTranzactii));
        }

        raport.sort((e1, e2) ->e2.getValue().compareTo(e1.getValue()));

        BufferedWriter writer = new BufferedWriter(new FileWriter(outputhPath));
        for (Map.Entry<Produs, Integer> entry : raport) {
            writer.write(entry.getKey().getDenumire() + ", " + entry.getValue());
            writer.newLine();
        }
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        List<Produs> produse = citesteProduse("C:\\Users\\User\\IdeaProjects\\Activitate cts\\src\\tema2_exemplu_subiect_examen\\date\\subiect1\\produse.txt");
        List<Tranzactie> tranzactii = citesteTranzactii("C:\\Users\\User\\IdeaProjects\\Activitate cts\\src\\tema2_exemplu_subiect_examen\\date\\subiect1\\tranzactii.json");

        System.out.println("Produse: ");
        for (Produs p : produse) {
            System.out.println(p);
        }

        System.out.println("\nTranzactii: ");
        for (Tranzactie t : tranzactii) {
            System.out.println(t);
        }

        System.out.println("\n");
        System.out.println("Numarul de produse: " + produse.size());
        System.out.println("\n");

        produse.sort(Comparator.comparing(Produs::getDenumire));

        System.out.println(("Produse ordonate alfabetic: "));
        for (Produs p : produse) {
            System.out.println(p);
        }

        scrieRaport(produse, tranzactii, "C:/Users/User/IdeaProjects/Activitate cts/src/tema2_exemplu_subiect_examen/date/subiect1/lista.txt");
    }
}
