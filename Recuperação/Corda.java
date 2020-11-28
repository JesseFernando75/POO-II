package recuperacao;

public class Corda extends Instrumento{
    private int num_cordas;
    private String corda;
    private boolean afinacao = false;
    private Pares inf;
    
    public Corda(String nome, String material, int num_cordas, String corda, Pares inf) {
        super(nome, material);
        this.num_cordas = num_cordas;
        this.corda = corda;
        this.inf = inf;
    }

    @Override
    public void obtemTipo() {
        if(num_cordas <= 0){
            throw new RuntimeException("Não é um instrumento de cordas.");
        }
        else if(num_cordas == 6 ){
            System.out.println("Possivalmente, guitarra ou violão.");
        } else{
             System.out.println("Outro tipo de instrumento de corda.");
        }
    }
    
    public void afinar(){
        System.out.println("Afinado.");
        afinacao = true;
    }
    
    public void desafinar(){
        if(afinacao == true){
            System.out.println("Okay, desafinado, basta ajustar.");
            afinacao = false;
        } else{
           throw new RuntimeException("Já está desafinado."); 
        }
    }   
}
