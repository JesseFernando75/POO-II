package exe1;

public class Main {
    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca("Central");
        Livro l1 = new Livro("123456/12");
        Capitulo c1 = new Capitulo(2);
        Autor a1 = new Autor("Jhon");  
        
        public void mostraValores(){
            System.out.println("Autor: " +a1.getNome());
            System.out.println("ISBN: " +l1.getIsbn());
            System.out.println("Capitulo: " +c1.getNumero());
            System.out.println("Biblioteca: " +b1.getNome());  
        }
        
        mostraValores();  
    }
}
