
public class Bank {

    public static void main(String[] args) {

        Konto konto1 = new Konto("123456789", "Kowalski", 0);
        Konto konto2 = new Konto("123456766", "Kowalska", 0);

        konto1.wplata(5);
        konto2.przelew(konto1.saldo);
    System.out.println(konto2.saldo);
    }


}
