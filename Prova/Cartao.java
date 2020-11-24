package prova;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cartao {
    Scanner input = new Scanner(System.in);
    private String bandeira, nome_titular, num_cartao;
    private int ano_validade = dh.setAno(2023), senha;
    private boolean bloqueado = true;

    public Cartao(String bandeira, String nome_titular, int ano_validade, int senha, String num_cartao) {
        this.bandeira = bandeira;
        this.nome_titular = nome_titular;
        this.ano_validade = ano_validade;
        this.senha = senha;
        this.num_cartao = num_cartao;
    }
    
    public void Comprar(){
      System.out.print("Digite a senha: ");
         try{
            int passe = input.nextInt();
            if(passe == senha){
               Liberar();
               System.out.println("Senha correta. Operacão liberada.");
            } else{
               Bloquear();
               System.out.println("Senha incorreta. Operação bloqueada.");
            }
         }
         catch(InputMismatchException e){
            System.out.println("Entrada inválida.");
         }
    }
    
    private void Bloquear(){
        System.out.println("Cartão bloqueado.");
        bloqueado = true;
    }
    
    private void Liberar(){
        System.out.println("Cartão liberado.");
        bloqueado = false;
    }

    public boolean isBloqueado() {
        return bloqueado;
    } 
}
