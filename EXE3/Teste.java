package teste;

public class Teste {

    public static void main(String[] args) {
        Baralho bara1 = new Baralho();
        try{
            bara1.informarCarta(2, "Espadas");
            bara1.informarCarta(9, "Ouros");
            bara1.informarCarta(7, "Paus");
            bara1.informarCarta(10, "Copas");
            System.out.println(bara1.toString());
        }catch(Exception e){
            System.out.println("Erro: " +  e.getMessage());
        }
        
    }
    
}
