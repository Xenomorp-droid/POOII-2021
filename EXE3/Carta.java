package teste;

public class Carta {
    
    private String naipe;
    private int num;
    
    public void setNumero(int num) throws Exception{
        if(num > 0 && num <=13){
            this.num = num;
        }else{
            throw new Exception("Número da carta não é suportado");
        }    
    }
    
    public void setNaipe(String naipe) throws Exception{
        if(naipe.toUpperCase().equals("Copas") || naipe.toUpperCase().equals("Ouros") ||
           naipe.toUpperCase().equals("Espadas") || naipe.toUpperCase().equals("Paus")){
            this.naipe = naipe;
        }else{
            throw new Exception("Só é possivel criar cartas com naipes diponíveis");
        }
    }

    public String getNaipe() {
        return naipe;
    }
    
    public int getNum() {
        return num;
    }

    public Carta(int num, String naipe) throws Exception{
        setNumero(num);
        setNaipe(naipe);
    }
    
}