package exe2;

public class EXE2 {
    public static void main(String[] args) {
        int meus_pontos, seus_pontos;
        
        Baralho b1 = new Baralho();
        Jogada j1 = new Jogada();
        
        System.out.println("Bem-vindo ao jogo vinte e um. Seu objetivo é totalizar "
                                       + "21 pontos a partir das cartas sortedas.");
        System.out.println("A cada rodada você tem a opção de tirar uma carta ou passar a vez. \n");
        
        do{
            if(j1.comecaJogar() == true){
                   b1.limpaBaralho();
                   b1.gerarBaralho();
                   b1.embaralhar();

                   meus_pontos = b1.meusPontos();
                   System.out.println("Meus pontos: " +meus_pontos +"\n");
                   seus_pontos = b1.seusPontos();
                   System.out.println("Seus pontos: " +seus_pontos +"\n");

                    while(meus_pontos < 50){
                      if(j1.passaVez() == true){
                        meus_pontos += b1.meusPontos();
                        System.out.println("Meus pontos no total: " +meus_pontos +"\n");
                      } else{
                          meus_pontos += b1.meusPontos();
                          System.out.println("Meus pontos no total: " +meus_pontos +"\n");
                          seus_pontos += b1.seusPontos();
                          System.out.println("Seus pontos no total: " +seus_pontos +"\n");
                       }

                      if(seus_pontos > 21 || meus_pontos == 21){
                          System.out.println("Você perdeu, eu venci. Já sabia...");
                          break;
                      } else if (meus_pontos > 21 || seus_pontos == 21){
                          System.out.println("Droga! Você ganhou.");
                          break;
                        } else if (meus_pontos == 21 && seus_pontos == 21){
                            System.out.println("Empatou. Mas considero ter vencido...");
                            break;
                        }
                    }    
             } else{
                System.exit(0);
             }
        } while(true);  
    }  
}
