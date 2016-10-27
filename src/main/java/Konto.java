public class Konto {

    String numerKonta;
    String wlasciciel;
    int saldo;


    public Konto(String numerKonta, String wlasciciel, int saldo) {
        this.numerKonta = numerKonta;
        this.wlasciciel = wlasciciel;
        this.saldo = saldo;
    }
    public Konto(String numerKonta, String wlasciciel) {
        this.numerKonta = numerKonta;
        this.wlasciciel = wlasciciel;
        this.saldo = 0;  ////<----Ten parametr ustawia saldo na zero.
    }
    public void wplata( int kwota ) {
        this.saldo += kwota;

    }

    public void przelewNa(Konto kontoOdbiorcy, int kwotap){  ////// przelewNa = to metoda do robienia przelewu. Konto = to jest typ obiektu np.konto1, int kwotap = kwota przelewu do wysłania.
        this.saldo -= kwotap; /// this. saldo wskazuje na saldo konta po lewej stronie komendy przelewNa this.saldo -=kwotap
        kontoOdbiorcy.saldo += kwotap; /// <----- dodaje na konto puieniądze
    }
   // public void przelew2(int kwotap2){

   // }
}


