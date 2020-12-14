package exe3;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class EXE3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
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
                    Iterator<Float> it = numeros.iterator();
                    while(it.hasNext()){
                        System.out.println(it.next());
                    }
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
