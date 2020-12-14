package exe3_4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EXE3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, numero;
        int opcao;
        Map<String, String> hm = new HashMap<>();
        
        while(true){
            System.out.println("\n1. Adicionar pessoa;");
            System.out.println("2. Localizar telefone por nome da pessoa.");
            System.out.println("3. Localizar pessoa por prefixo.");
            System.out.println("4. Sair.");
            System.out.println("Selecione a opção: ");
            opcao = input.nextInt();
            
            switch(opcao) {
                case 1: {
                    System.out.print("Digite o nome: ");
                    nome = input.next();
                    System.out.print("Digite o número: ");
                    numero = input.next();
                    hm.put(nome, numero);
                    break;
                }
                
                case 2: {
                    System.out.print("Digite o nome a ser buscado: ");
                    final String nome1 = input.next();
                    
                    if(hm.containsKey(nome1)){                             
                    System.out.println("Telefone: " +
                            hm.entrySet().stream().filter(map -> nome1.equals(map.getKey()))
                                    .map(map -> map.getValue()).collect(Collectors.joining(",")));
                    } else{
                        System.out.println("Não encontrado");
                    }
                 break;
                }
               
                case 3: {
                    System.out.print("Digite o prefixo do nome a ser buscado: ");
                    final String nome1 = input.next();
                    
                    System.out.println("Pessoa(s): " +
                            hm.entrySet().stream().filter(map -> map.getKey().startsWith(nome1))
                                    .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue())));
                    
                  break; 
                }

                case 4: {
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
