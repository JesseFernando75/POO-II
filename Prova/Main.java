package prova;

public class Prova {
    public static void main(String[] args) {
       Credito c1 = new Credito("Master", "José", 2022, 4523, "45987", 1.2);
       Debito b1 = new Debito("Visa", "João", 2023, 2345, "87945", 200, true, false);
       
       c1.Comprar();
       c1.isBloqueado();
       c1.parcelar(10);
       c1.getFatura();
       
       b1.Comprar();
       b1.Depositar(100);
       b1.Sacar(400);
       b1.getSaldo();
    }    
}
