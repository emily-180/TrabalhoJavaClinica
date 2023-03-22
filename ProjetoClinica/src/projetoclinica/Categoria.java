
package projetoclinica;

public class Categoria {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void mostra(String nome) { 
        System.out.println("Categoria: "+nome);
    }
}
