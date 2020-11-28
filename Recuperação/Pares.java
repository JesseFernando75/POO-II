package recuperacao;

public class Pares {
    private static String s1, s2;

    public Pares(String s1, String s2) {
        Pares.s1 = s1;
        Pares.s2 = s2;
    }
    
    public static String getPrimeiraInformação(){
        return s1;
    }
    
     public static String getSegundaInformação(){
        return s2;
    }   
}
