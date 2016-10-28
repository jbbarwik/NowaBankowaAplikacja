import java.io.PrintStream;
import java.util.Scanner;

public class Bank {

    private Scanner inn;
    private PrintStream komunikat;

    public Bank(Scanner inn, PrintStream komunikat) {
        this.inn = inn;
        this.komunikat = komunikat;
    }

    public void zrobOperacje() {
        Konto konto1 = new Konto("123456789", "Kowalski", 0);
        Konto konto2 = new Konto("123456766", "Kowalska", 0);

        // Zrób wpłatę
        zrobWplate(konto2);

        // Zrób przelew
        zróbPrzelew(konto1, konto2);

        // Pokaż stan kont po operacjach
        pokazStanKont(konto1, konto2);
    }

    private void pokazStanKont(Konto konto1, Konto konto2) {
        komunikat.println("saldo konta1: "+konto1.saldo);
        komunikat.println("saldo konta2: "+konto2.saldo);
        String ss = konto1.toString();
        komunikat.println(ss);
    }

    private void zróbPrzelew(Konto konto1, Konto konto2) {
        komunikat.println("Podaj wartość przelewu z 2 na 1");
        int przelewin = inn.nextInt(); ///<-nowa zmienna przechowująca dane ze skannera
        konto2.przelewNa(konto1, przelewin); ///<---- wywołanie przelewu
    }

    private void zrobWplate(Konto konto) {
        komunikat.println("Podaj wartość wpłaty na konto2");
        int wpłatain = inn.nextInt(); ///<---- nowa zmienna przechowująca dane ze skannera
        konto.wplata(wpłatain); ///<---wywołanie wpłaty
    }

}



