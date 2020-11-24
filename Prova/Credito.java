package prova;
import java.util.InputMismatchException;

public class Credito extends Cartao{
    private double anuidade, valor_fatura, valor_compra;
    DataHora dh = new DataHora(12, 5, 2022, 14, 23, 11);
    
    public Credito(String bandeira, String nome_titular, int ano_validade,
            int senha, String num_cartao, double anuidade) {
        super(bandeira, nome_titular, ano_validade, senha, num_cartao);
        this.anuidade = anuidade;
    }
    
    public void parcelar(int parcelas){
        try{
            if(parcelas <= 0 || parcelas > 12){
               System.out.println("Número de parcelas inconsistente.");
            } else{
               System.out.println("Parcelado em " +parcelas+ " vez(es).");
               valor_compra = 100;
            }
         }
         catch(InputMismatchException e){
            System.out.println("Entrada inválida.");
         }
    }
    
    public void getFatura(){
        valor_fatura = valor_compra + anuidade();
         System.out.println("A fatura está em: " +valor_fatura);
    }
    
    private double anuidade(){
        return anuidade += anuidade;   
    }
}
