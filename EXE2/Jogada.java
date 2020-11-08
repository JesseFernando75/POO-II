package exe2;
import java.util.Scanner;

public class Jogada {
    Scanner input = new Scanner(System.in);
        
     public boolean comecaJogar(){
         boolean opcao = false, exception;
             do {
              try{
                 System.out.print("Quer jogar? -> true para sim ou false para não: ");
                 opcao = input.nextBoolean();
                 exception = false;
              } 
               catch(java.lang.Exception InputMismatchException){
                 System.out.print("\nOps... digite true para jogar ou false para sair.\n"); 
                 input.next();
                 exception = true;
               }   
             } while(exception == true);
         return opcao;
     }
    
     public boolean passaVez(){
         boolean opcao = false, exception;
             do {
              try{
                 System.out.print("Quer passar a vez? -> true para sim ou false para não: ");
                 opcao = input.nextBoolean();
                 exception = false;
              } 
               catch(java.lang.Exception InputMismatchException){
                 System.out.print("\nOps... digite true para passar a vez ou false para jogar.\n"); 
                 input.next();
                 exception = true;
               }   
             } while(exception == true);
         return opcao;
     }   
 }   

