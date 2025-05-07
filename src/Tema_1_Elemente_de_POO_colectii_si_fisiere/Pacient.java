package Tema_1_Elemente_de_POO_colectii_si_fisiere;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class Pacient implements Serializable {
    private static final long serialVersionUID = 1L;
    private int codPacient;
    private String numePacient;
    private String denumireSectie;

    Pacient (int newCodPacient, String newNumePacient, String newDenumireSectie) {
        this.codPacient = newCodPacient;
        this.numePacient = newNumePacient;
        this.denumireSectie = newDenumireSectie;
    }

    int getCodPacient () {
        return codPacient;
    }

    String getNumePacient () {
        return numePacient;
    }

    String getDenumireSectie () {
        return denumireSectie;
    }

    @Override public String toString() {
        return "Cod pacient: " + codPacient + "; " + "Nume pacient: " + numePacient + "; " + "Denumire sectie: " + denumireSectie + ";";
    }

    public static int getTotalPacienti(String caleFisier) {
        try {
            return (int) Files.lines(Paths.get(caleFisier)).count();
        } catch (IOException e) {
            System.out.println("Eroare la citirea fisierului: " + e.getMessage());
            return 0;
        }
    }

    public static String getListaSectiiDesc (String caleFisier) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(caleFisier));

            Map<String, Integer> sectii = new HashMap<>();
            for (String line : lines) {
                String[] parts = line.split(",");
                String sectie = parts[2].trim();
                sectii.put(sectie, sectii.getOrDefault(sectie, 0) + 1);
            }

            List<Map.Entry<String, Integer>> sectiiSortate = new ArrayList<>(sectii.entrySet());
            sectiiSortate.sort((a, b) -> b.getValue() - a.getValue());

            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, Integer> entry : sectiiSortate) {
                sb.append("Sectie: ").append(entry.getKey()).append(" | Nr. pacienti: ").append(entry.getValue()).append("\n");
            }
            return sb.toString();
        } catch (IOException e) {
            return "Eroare la citirea fisierului: " + e.getMessage();
        }
    }

    public static List<Pacient> citestePacienti(String caleFisier) {
        List<Pacient> pacienti = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(caleFisier));
            for (String line : lines) {
                String[] parts = line.split(",");
                int cod = Integer.parseInt(parts[0].trim());
                String nume = parts[1].trim();
                String sectie = parts[2].trim();
                pacienti.add(new Pacient(cod, nume, sectie));
            }
        } catch (IOException e) {
            System.out.println("Eroare la citirea fisierului: " + e.getMessage());
        }
        return pacienti;
    }

    public static void scriePacientiInFisierBinar(String caleFisierText, String caleFisierBinar) {
        List<Pacient> pacienti = citestePacienti(caleFisierText);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(caleFisierBinar))) {
            oos.writeObject(pacienti);
            System.out.println("Fisierul binar a fost generat cu succes.");
        } catch (IOException e) {
            System.out.println("Eroare la scrierea fisierului binar: " + e.getMessage());
        }
    }

    public static void citesteSiAfiseazaFisierBinar(String caleFisierBinar) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caleFisierBinar))){
            List<Pacient> pacienti = (List<Pacient>) ois.readObject();
            System.out.println("Continutul fisierului binar: ");
            for (Pacient p : pacienti){
                System.out.println(p);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Eroare la citirea fisierului binar: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String caleTxt = "pacienti.txt";
        String caleBinar = "pacienti.dat";

        int totalPacienti = getTotalPacienti(caleTxt);
        //int totalPacienti = getTotalPacienti("pacienti.txt");
        System.out.println("Numar total de pacienti: " + totalPacienti);
        //System.out.println((getListaSectiiDesc("pacienti.txt")));
        System.out.println((getListaSectiiDesc(caleTxt)));

        scriePacientiInFisierBinar(caleTxt, caleBinar);
        citesteSiAfiseazaFisierBinar(caleBinar);
    }
}
