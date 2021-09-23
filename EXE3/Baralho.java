package teste;

public class Baralho {
    
    private int copas;
    private int paus;
    private int espadas;
    private int ouros;
    private int numeroCartas;
    private Carta[] cartas = new Carta[QUANTICARTAS];
    private final static int QUANTICARTAS = 52;
    
    public void informarCarta(int num, String naipe) throws Exception{
        if (numeroCartas >= QUANTICARTAS){
            throw new Exception("Cartas mostradas");
        }        
        for (int i = 0; i < numeroCartas; i++){
            if (cartas[i].getNum() == num && cartas[i].getNaipe().equals(naipe)){
                throw new Exception("Carta com mesmo naipe/número já existem!");
            }
        }
        
        if (naipe.toUpperCase().equals("Ouros")){
            if(ouros <= 13){
                this.ouros++;
            }else{
                throw new Exception("Todas as cartas do naipe já foram adicionadas");
            }
        }
        if (naipe.toUpperCase().equals("Copas")){
            if(copas <= 13){
                this.copas++;
            }else{
                throw new Exception("Todas as cartas do naipe já foram adicionadas");
            }
        }
        if (naipe.toUpperCase().equals("Paus")){
            if(paus <= 13){
                this.paus++;
            }else{
                throw new Exception("Todas as cartas do naipe já foram adicionadas");
            }
        }
        if (naipe.toUpperCase().equals("Espadas")){
            if(espadas <= 13){
                this.espadas++;
            }else{
                throw new Exception("Todas as cartas do naipe já foram adicionadas");
            }
        }
        
        this.cartas[numeroCartas] = new Carta(num, naipe);
        numeroCartas++;
    }
    
    public Baralho(){
        numeroCartas = 0;
        cartas = new Carta[this.QUANTICARTAS];
    }
    
    @Override
    public String toString(){
        String informacao = "";
        
        for (int i = 0; i < numeroCartas; i++){
            informacao += cartas[i].getNum() + " | " + cartas[i].getNaipe() + "\n";
        }
        return informacao;
    }
    
}