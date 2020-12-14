package exe3_2;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class EXE3_2 {
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
                    nome = input.next();
                    
                    if(hm.containsKey(nome)){
                        System.out.println("Telefone: " +hm.get(nome));
                    } else{
                         System.out.println("Não encontrado");
                    }
                 break;
                }

                case 3: {
                    System.out.print("Digite o prefixo do nome a ser buscado: ");
                    nome = input.next();
                    
                    Iterator<String> it = hm.keySet().iterator();
                    while(it.hasNext()){
                        String e = it.next();
                        if(e.startsWith(nome)){
                            System.out.println(e+ ", " +hm.get(e));
                        }
                    }
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
