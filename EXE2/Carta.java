package exe2;

public class Carta {
    private String[] naipe = {"copas", "espadas", "ouros", "paus"};
    private String[] carta = {"Às", "2", "3", "4", "5", "6", "7", "8",
                               "9", "10", "Valete", "Dama", "Rei"};

    public String getNaipe(int index) {
        return naipe[index];
    }
    
     public String getCarta(int index) {
        return carta[index];
    }     
}
