package exe1poo2;

public class Biblioteca {
    public Livro livro;
    public String nome;
    
    public Livro getLivro() {
        return livro;
    }
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void Status() {
        System.out.println("Biblioteca "+ this.getNome() + "Livro " + this.getLivro());
    }
    
}
