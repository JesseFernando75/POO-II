package exe2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EXE2 { 
    public static void main(String[] args) {
        int num;
        
        Scanner input = new Scanner(System.in);
        Baralho b1 = new Baralho();
        
        try{
            System.out.print("Digite quantas cartas quer pegar: ");
            num = input.nextInt();
            b1.gerarBaralho();
            b1.embaralhar();
            b1.pegaCarta(num);
        } catch(InputMismatchException e){
            System.out.println("Digite um número inteiro.");
          }         
    } 
        
}
