package prova;
import java.util.InputMismatchException;

public class Debito extends Cartao{
    private double saldo;
    private int ano_validade = dh.setAno(2022);
    private boolean seguro, cobertura;
   
    public Debito(String bandeira, String nome_titular, int ano_validade, int senha,
                  String num_cartao, double saldo, boolean seguro, boolean cobertura) {
        super(bandeira, nome_titular, ano_validade, senha, num_cartao);
        this.saldo = saldo;
        this.seguro = seguro;
        this.cobertura = cobertura; 
    }
    
    public void Sacar(int valor){
         try{
             if(valor <= 0 || valor > saldo){
                System.out.print("Não efetuado.");
             }
             else{
                System.out.print("Saque efetuado.");
                diminuiSaldo(valor);
             }
         }
         catch(InputMismatchException e){
             System.out.println("Entrada inválida.");
         }
    }
    
    private void diminuiSaldo(double valor){
        setSaldo(getSaldo() - valor);
        System.out.println("Saldo atual: " +getSaldo());
    }
    
    public void Depositar(double valor_deposito){
         try{
            saldo += valor_deposito;
         }
         catch(InputMismatchException e){
             System.out.println("Entrada inválida.");
         }
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    } 
}
