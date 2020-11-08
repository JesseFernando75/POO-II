package exe2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Baralho {
    List<String> baralho = new ArrayList<String>(); 
    Map<String, Integer> cartas = new HashMap<String, Integer>();
    Random posicao = new Random();
    Carta c1 = new Carta();

     public void gerarBaralho(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++) {
                baralho.add(c1.getCarta(j) + " de " + c1.getNaipe(i));
                if(j < 9){
                    cartas.put(c1.getCarta(j) + " de " + c1.getNaipe(i), j+1);
                } else if (j >= 9){
                     cartas.put(c1.getCarta(j) + " de " + c1.getNaipe(i), 10);
                }
            }
        }
     }
     
     public int valorCarta(String carta){
        return cartas.get(carta);
     }
     
     public int meusPontos(){
        String minha_carta = pegaCarta(); 
        System.out.print("Minha carta: " +minha_carta +"\n");
        return valorCarta(minha_carta);
     }
     
     public int seusPontos(){
        String sua_carta = pegaCarta(); 
        System.out.print("Sua carta: " +sua_carta +"\n");
        return valorCarta(sua_carta);
     }
     
     public void embaralhar() {
       Collections.shuffle(baralho);
     }
     
     public void limpaBaralho(){
         baralho.clear();
     }
     
     public String pegaCarta(){
         String carta = baralho.get(posicao.nextInt(baralho.size()));
         baralho.remove(carta);
         return carta;
    }     
}
