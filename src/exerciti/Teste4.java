package exerciti;

import java.io.*;
import java.util.*;

class PersoanaEu implements Serializable {
    private final String nume;
    private final int varsta;

    public PersoanaEu(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String toString() {
        return String.format("%s (%d ani)", nume, varsta);
    }
}

class Teste {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        PersoanaEu ion = new PersoanaEu("Ion", 23);
        PersoanaEu maria = new PersoanaEu("Maria", 22);

        var file = new File("date\\test.dat");

        file.getParentFile().mkdirs();

        try (var fileOut = new ObjectOutputStream(
                new FileOutputStream(file, false))) {
            fileOut.writeObject(ion);
            fileOut.writeObject(maria);
        }

        List<PersoanaEu> persoane = new ArrayList<>();
        try (var fileIn = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                persoane.add((PersoanaEu) fileIn.readObject());
            }
        } catch (EOFException e) {
            System.out.println(persoane);
        }
    }
}
