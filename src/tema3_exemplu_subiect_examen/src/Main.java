package tema3_exemplu_subiect_examen.src;

import java.util.*;

public class Main {
    public static void afiseazaCursuriVineri(List<Programare> programari, List<Disciplina> discipline) {
        System.out.println("\nLista de cursuri programate vineri:");

        List<Programare> programariVineri = programari.stream()
                .filter(p-> p.getZi().equalsIgnoreCase("vineri"))
                .sorted(Comparator.comparing(Programare::getSala))
                .toList();

        for (Programare p : programariVineri) {
            Disciplina d = discipline.stream()
                    .filter(disc -> disc.getId() == p.getidDisciplina())
                    .findFirst()
                    .orElse(null);

            if (d != null) {
                System.out.printf("%s, Ora%s, %s, %s%n",
                        p.getZi(),
                        p.getInterval().split("-")[0].replace(":", ""),
                        p.getSala(),
                        d.getDenumire()
                );
            }
        }
    }

    public static void afiseazaProgramariSala(List<Programare> programari, List<Disciplina> discipline) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti denumirea salii (ex: 2101): ");
        String salaCautata = scanner.nextLine().trim();

        List<Programare> programariInSala = programari.stream()
                .filter(p -> p.getSala().equalsIgnoreCase(salaCautata))
                .toList();

        System.out.println("\n Programari pentru sala " + salaCautata + ":");

        for (Programare p : programariInSala) {
            Disciplina d = discipline.stream()
                    .filter(disc -> disc.getId() == p.getidDisciplina())
                    .findFirst()
                    .orElse(null);

            if (d != null) {
                System.out.printf("%s, Ora%s, %s, %s%n",
                        p.getZi(),
                        p.getInterval().split("-")[0].replace(":", ""),
                        d.getDenumire(),
                        p.getFormatie());
            }
        }
    }

    public static void main(String[] args) {
        List<Disciplina> discipline = DisciplinaReader.citesteDiscipline("C:\\Users\\User\\IdeaProjects\\Activitate cts\\src\\tema3_exemplu_subiect_examen\\S16_discipline.txt");
        System.out.println("Discipline optionale:");
        for (Disciplina d: discipline) {
            if (d.getTip().equalsIgnoreCase("optional")) {
                System.out.println(d.getDenumire());
            }
        }

        List<Programare> programari = ProgramareReader.citesteProgramari("C:\\Users\\User\\IdeaProjects\\Activitate cts\\src\\tema3_exemplu_subiect_examen\\S16_programari.db");
        System.out.println("\nToate programarile:");
        for (Programare p : programari) {
            System.out.println(p);
        }

        afiseazaCursuriVineri(programari, discipline);
        afiseazaProgramariSala(programari, discipline);
    }
}
