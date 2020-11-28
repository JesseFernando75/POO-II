package recuperacao;

public class Recuperacao {
    public static void main(String[] args) {
        Corda c1 = new Corda("Violão", "Madeira", 6, "Nylon", new Pares("Vendido", "10% de desconto"));
        Sopro s1 = new Sopro("Flauta", "Melta", 5, "Metálica", new Triplas("Sale", "5% de desconto", "Em estoque"));
        
        c1.obtemTipo(); 
        c1.afinar();
        c1.desafinar();
        c1.tocar();
        c1.pararMusica();
        System.out.println("Primeira inf: " +Pares.getPrimeiraInformação());
        System.out.println("Segunda inf: " +Pares.getSegundaInformação());
        
        System.out.println();
        
        s1.obtemTipo();
        s1.oxigenar();
        s1.desoxigenar();
        s1.tocar();
        s1.pararMusica();    
        System.out.println("Primeira inf: " +Triplas.getPrimeiraInformação());
        System.out.println("Segunda inf: " +Triplas.getSegundaInformação());
        System.out.println("Segunda inf: " +Triplas.getTerceiraInformação());
    }  
}
