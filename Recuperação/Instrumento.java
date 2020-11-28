package recuperacao;

public abstract class Instrumento {
    private String nome;
    private String material;
    private boolean tocando = false;

    public Instrumento(String nome, String material) {
        this.nome = nome;
        this.material = material;
    }
    
    public void tocar(){
        System.out.println("Tocando...");
        tocando = true;
    }
    
    public void pararMusica(){
        if(tocando == true){
            System.out.println("Okay, não está mais tocando.");
            tocando = false;
        } else{
           throw new RuntimeException("Não estava tocando"); 
        }
    }
    
    public abstract void obtemTipo();    
}
