package recuperacao;

public class Sopro extends Instrumento{
    private int num_buracos;
    private String embocadura;
    private boolean ar = false;
    private Triplas inf;

    public Sopro(String nome, String material, int num_buracos, String embocadura, Triplas inf) {
        super(nome, material);
        this.num_buracos = num_buracos;
        this.embocadura = embocadura;
        this.inf = inf;
    }

    @Override
    public void obtemTipo() {
        if(num_buracos <= 0){
            throw new RuntimeException("Não é um instrumento de sopro.");
        }
        else if(num_buracos == 6 ){
            System.out.println("Possivelmente, uma flauta.");
        } else{
             System.out.println("Outro tipo de instrumento de sopro.");
        }
    }
    
    public void oxigenar(){
        System.out.println("Done. Basta ajustar.");
        ar = true;
    }
    
    public void desoxigenar(){
        if(ar == true){
            System.out.println("Okay, pulmões sem ar.");
            ar = false;
        } else{
           throw new RuntimeException("Já estava desoxigenado."); 
        }
    }  
}
