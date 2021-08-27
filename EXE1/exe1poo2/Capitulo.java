package exe1poo2;

public class Capitulo {
    public Livro livro;
    public int numero;
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public Livro getLivro() {
        return livro;
    }
    
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
    public Capitulo (Livro livro, int numero) {
        this.livro = livro;
        this.numero = numero;
    }
    
    public void Status(){
        System.out.println("Numero Cap: "+ this.getNumero() + "Livro " + this.getLivro());
    }
    
}


