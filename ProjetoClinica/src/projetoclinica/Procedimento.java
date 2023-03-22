
package projetoclinica;

public class Procedimento {
    Categoria  cate = new Categoria();
    private String nomeProcedimento;
    private double valor;

    public String getNomeProcedimento() {
        return nomeProcedimento;
    }

    public void setNomeProcedimento(String nomeProcedimento) {
        this.nomeProcedimento = nomeProcedimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void mostra(String nome, double preco, String nomeC) { 
        System.out.println("Categoria: "+nomeC);
        System.out.println("Procedimento: "+nome);
        System.out.println("Valor: "+preco);
    }
}
