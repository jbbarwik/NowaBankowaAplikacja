import java.io.PrintStream;
import java.util.Scanner;

// klasa ParaBankJanka implementuje interfejs Bank
public class ParaBankJanka implements Bank {

    // Pola na klasie (obiekcie) ParaBankJanka
    // Pole tak jak każda zmienna musi mieć typ i nazwę
    // Pole dodatkowo może mieć specyfikację dostępu: private, "default", protected, public
    private Scanner inn;
    private PrintStream komunikat;


    // Konstruktor. Jest wywoływany przy tworzeniu obiektu.
    // Zapewnia poprawną inicjalizację stanu obiektu
    // Np. przez pobranie parametrów,
    // które przypiszemy jako początkowy stan pók obiektu
    // Kiedy tworzymy nowe obiekt wywołując konstruktor musi podać wszystkie parametry
    // np. Bank jakiśBank = new ParaBankJanka(new Scanner(System.in), System.out)
    public ParaBankJanka(Scanner inn, PrintStream komunikat) {
        this.inn = inn;
        this.komunikat = komunikat;
    }

    // @Override powoduje, że kompilator zwróci nam uwagę,
    // kiedy okaże się, że w praktyce wcale nie nadpisujemy ("override") metody.
    @Override
    // Metoda publiczna - implementuje interfejs
    // Brak parametrów
    // Nic nie zwraca - void
    public void zrobOperacje() {
        // Zmienne lokalne w metodzie
        Konto konto1 = new Konto("123456789", "Kowalski", 0);
        Konto konto2 = new Konto("123456766", "Kowalska", 0);

        // Zrób wpłatę
        zrobWplate(konto2);

        // Zrób przelew
        zróbPrzelew(konto1, konto2);

        // Pokaż stan kont po operacjach
        pokazStanKont(konto1, konto2);
    }


    // metoda prywatna - powstała jak efekt refaktoryzacji metody zrobOperacje()
    // poprzez Refactor -> Extract -> Method
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



