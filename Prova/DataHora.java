package prova;

public final class DataHora implements Data,Hora{

    public DataHora(int dia, int mes, int ano, int hora, int minuto, int segundo) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo); 
    }
    
    

    @Override
    public void setDia(int dia) {
        if(dia > 0 && dia <= 30){
               System.out.println("Dia: " +dia);
            } else{
               throw new RuntimeException("Inválido");
            }
    }

    @Override
    public void setAno(int ano) {
         if(ano > 0){
               System.out.println("Ano: " +ano);
            } else{
               throw new RuntimeException("Inválido");
            }
    }

    @Override
    public void setMes(int mes) {
         if(mes > 0 && mes <= 12){
               System.out.println("Mês: " +mes);
            } else{
               throw new RuntimeException("Inválido");
            }
    }

    @Override
    public void setHora(int hora) {
        if(hora > 0 && hora <= 24){
               System.out.println("Hora: " +hora);
            } else{
               throw new RuntimeException("Inválido");
            }
    }

    @Override
    public void setMinuto(int minuto) {
         if(minuto > 0 && minuto < 60){
               System.out.println("Minuto: " +minuto);
            } else{
               throw new RuntimeException("Inválido");
            }
    }

    @Override
    public void setSegundo(int segundo) {
         if(segundo > 0 && segundo < 60){
               System.out.println("Segundo: " +segundo);
            } else{
               throw new RuntimeException("Inválido");
            }
    }
}
