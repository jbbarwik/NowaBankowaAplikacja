import java.util.Scanner;

public class Bank {

    public void zrobOperacje(Scanner inn) {
        Konto konto1 = new Konto("123456789", "Kowalski", 0);
        Konto konto2 = new Konto("123456766", "Kowalska", 0);
        //int wplatain = innn.nextInt();

        System.out.println("Podaj wartość wpłaty na konto2");

        int wpłatain = inn.nextInt();

        konto2.wplata(wpłatain);

        System.out.println("Podaj wartość przelewu z 2 na 1");
        int przelewin = inn.nextInt();
        konto2.przelewNa(konto1, przelewin); ///<---- wywołanie przelewu

        System.out.println("saldo konta1: "+konto1.saldo);
        System.out.println("saldo konta2: "+konto2.saldo);

        String ss = konto1.toString();
        System.out.println(ss);
    }
}



