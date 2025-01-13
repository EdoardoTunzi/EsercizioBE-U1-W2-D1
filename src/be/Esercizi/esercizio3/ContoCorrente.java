package be.Esercizi.esercizio3;

public class ContoCorrente {

   protected String titolare;
   protected int nMovimenti;
   protected final int maxMovimenti = 50;
   protected double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }
        public void preleva(double x) throws BancaException {
            if (nMovimenti < maxMovimenti) {
                saldo = saldo - x;
                if (saldo < 0) {
                    nMovimenti++;
                    throw new BancaException("Il conto è in rosso ");
                }
            } else {
                saldo = saldo - x - 0.50;
                nMovimenti++;
            }
        }

        public double restituisciSaldo() {
        return saldo;
        }
}
