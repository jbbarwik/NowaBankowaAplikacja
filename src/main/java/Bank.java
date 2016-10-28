import java.io.PrintStream;
import java.util.Scanner;

public class Bank {

    /**
     * Robi wpłatę i przelew
     *
     * @param inn Stąd można czytać dane wprowadzane przez użyszkodnika
     * @param komunikat Tu dostaniemy obiekt do którego możemy pisać komunikaty do użytkownika
     *
     * */
    public void zrobOperacje(Scanner inn, PrintStream komunikat) {
        Konto konto1 = new Konto("123456789", "Kowalski", 0);
        Konto konto2 = new Konto("123456766", "Kowalska", 0);
        //int wplatain = innn.nextInt();

        komunikat.println("Podaj wartość wpłaty na konto2");

        int wpłatain = inn.nextInt(); ///<---- nowa zmienna przechowująca dane ze skannera

        konto2.wplata(wpłatain); ///<---wywołanie wpłaty

        komunikat.println("Podaj wartość przelewu z 2 na 1");

        int przelewin = inn.nextInt(); ///<-nowa zmienna przechowująca dane ze skannera
        konto2.przelewNa(konto1, przelewin); ///<---- wywołanie przelewu

        komunikat.println("saldo konta1: "+konto1.saldo);
        komunikat.println("saldo konta2: "+konto2.saldo);

        String ss = konto1.toString();
        komunikat.println(ss);
    }
}



