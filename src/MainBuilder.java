import exceptii.ExceptieNrIntrariInsuficiente;
import exceptii.ExceptiePodeaMoaleDecorSticla;
import java.util.Arrays;

public class MainBuilder {
    public static void main(String[] args) {
        try {
            Magazin magazin1 = new Magazin.MagazinBuilder()
                    .withDenumire("Zara")
                    .withSuprafata(300)
                    .withNrIntrari(3)
                    .build();
            System.out.println(magazin1);

            Magazin magazin2 = new Magazin.MagazinBuilder()
                    .withDenumire("H&M")
                    .withSuprafata(200)
                    .withNrIntrari(2)
                    .withPodea(new Podea(3))
                    .withDecoratiuni(Arrays.asList(
                            new Decoratiune("Lemn"),
                            new Decoratiune("Metal")))
                    .build();
            System.out.println(magazin1);

            Magazin magazin3 = new Magazin.MagazinBuilder()
                    .withDenumire("Ikea")
                    .withSuprafata(150)
                    .withNrIntrari(2)
                    .withPodea(new Podea(1)) //podea moale interzis pentru sticla
                    .withDecoratiuni(Arrays.asList(new Decoratiune("Sticla"))) //interzisa pe podea moale
                    .build();
            System.out.println(magazin3);
        } catch (ExceptieNrIntrariInsuficiente e) {
            System.out.println("X Eroare: " + e.getMessage());
        } catch (ExceptiePodeaMoaleDecorSticla e) {
            System.out.println("X Eroare: " + e.getMessage());
        }
    }
}
