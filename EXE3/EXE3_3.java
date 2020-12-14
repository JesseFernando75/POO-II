package exe3_3;
import static java.util.Collections.list;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EXE3_3 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int opcao;
        int num;
        Set<Float> numeros = new HashSet<>();
        
        while(true){
            System.out.println("\n1. Adicionar número;");
            System.out.println("2. Mostrar os valores e sair.");
            System.out.println("Selecione a opção: ");
            opcao = input.nextInt();
            
            switch(opcao) {
                case 1: {
                    System.out.print("Digite o número: ");
                    numeros.add(input.nextFloat());
                    break;
                }

                case 2: {
                  System.out.println("\nTotal de valores: " +numeros.stream().count());
                  System.out.println("Valores:");
                  numeros.forEach(n -> System.out.println(n));
                  System.exit(0);
                }

                default: {
                    System.out.print("Opção inválida.");
                    break;
                }
            }
        }   
    }   
}
