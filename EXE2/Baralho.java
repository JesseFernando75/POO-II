package exe2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Baralho {
    Scanner input = new Scanner(System.in);
    List<String> baralho = new ArrayList<String>(); 
    Random posicao = new Random();
    Carta c1 = new Carta();
       
     public void gerarBaralho(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++) {
                baralho.add(c1.getCarta(j) + " de " + c1.getNaipe(i));
            }
        }
     }
     
     public void embaralhar() {
       Collections.shuffle(baralho);
     }
     
     public void pegaCarta(int num){
        if(num <= 0 || num > 52){
            System.out.println("Digite um número entre 1 e 52.");
        } else{
           for(int i = 0; i < num; i++){
              String carta = baralho.get(posicao.nextInt(baralho.size()));
              baralho.remove(carta);
              System.out.printf("Sua carta %d: %s \n", i+1, carta);
            }
          }
        }
      }
         
