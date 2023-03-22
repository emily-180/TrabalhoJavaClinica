
package projetoclinica;

public class Consulta {
    private String data;
    private String hora;
    Cliente c = new Cliente();
    Profissional p = new Profissional();
    Procedimento pr = new Procedimento();
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    
    }  
    
}
