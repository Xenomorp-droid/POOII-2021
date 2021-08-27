package exe1poo2;

public class EXE1POO2 {

    public static void main(String[] args) {
        
        Autor A1 = new Autor();
        A1.setNome("Heurelio");
        A1.getLivro();
       
        Biblioteca B1 = new Biblioteca ();
        Livro L1 = new Livro ();
        
        L1.getBiblioteca();
        L1.setISBN("Banco");
        L1.getAutor();
        B1.setNome("Leitura");
        B1.setLivro(L1);
        B1.Status();
        
        Capitulo C1 = new Capitulo(67,L1);   
    }
    
}
