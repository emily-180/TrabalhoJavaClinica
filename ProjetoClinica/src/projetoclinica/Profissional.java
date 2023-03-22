
package projetoclinica;

public class Profissional {
    private String nomeProfissional;
    private String dataNascimento;
    private String cpf;
    private int telefone;
    private double salario;
    private boolean ativo;

    public String getNomeProfissional() {
        return nomeProfissional;
    }

    public void setNomeProfissional(String nomeProfissional) {
        this.nomeProfissional = nomeProfissional;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
        
    public void bonifica(double valor){ // método
        System.out.println("Salario atual: "+ getSalario());
        this.salario += valor;         
        System.out.println("O(a) "+ getNomeProfissional()+ " recebeu bonificação!");
        System.out.println("Salario Bonificado: "+ getSalario());
    }
    
    public void demite(){ // método
        if(ativo != false){
            ativo = false;
            System.out.println("O(a) " + getNomeProfissional() +" não está mais empregado!");
        }else
            System.out.println("O(a) " + getNomeProfissional() +" já não estava empregado!");
    }
    
    public void mostra(String nome, Boolean ativo) { 
        System.out.println("Profissional: "+nome);
        if(ativo)
            System.out.println("Está ativo! ");
        else
            System.out.println("Não está mais ativo! ");
    }
}
