package recuperacao;

public class Triplas {
    private static String s1, s2, s3;

    public Triplas(String s1, String s2, String s3) {
        Triplas.s1 = s1;
        Triplas.s2 = s2;
        Triplas.s3 = s3;
    }
    
    public static String getPrimeiraInformação(){
        return s1;
    }
    
     public static String getSegundaInformação(){
        return s2;
    } 
     
      public static String getTerceiraInformação(){
        return s3;
    }    
}
