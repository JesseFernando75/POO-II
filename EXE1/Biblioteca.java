package exe1;

public class Biblioteca {
    public Biblioteca(){

}
     private String nome;

    public Biblioteca(String nome) {
        this.setNome(nome);
    }
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
}
