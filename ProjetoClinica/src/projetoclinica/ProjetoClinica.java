
package projetoclinica;

import java.util.ArrayList;

import java.util.Scanner;

public class ProjetoClinica {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        ArrayList<Categoria> c = new ArrayList<>();
        ArrayList<Procedimento> p = new ArrayList<>();
        ArrayList<Profissional> pr = new ArrayList<>();
        ArrayList<Consulta> co = new ArrayList<>();
        String nome;
        int op;
        //Pedindo dados do Cliente
        Cliente c1 = new Cliente();
        System.out.println("************** DADOS DO CLIENTE  ***********");
        System.out.println("Nome:");
        c1.setNomeCliente(entrada.nextLine());
        System.out.println("Data de Nascimento:");
        c1.setDataNascimento(entrada.nextLine());
        System.out.println("Cpf:");
        c1.setCpf(entrada.nextLine());
        System.out.println("Telefone:");
        c1.setTelefone(entrada.nextInt());
        entrada.nextLine();  // corrige buffer do teclado
        
        do {
            menu();
            System.out.println("Digite sua opção:");
            op = entrada.nextInt();
            entrada.nextLine();  // corrige buffer do teclado
            switch(op) {
            case 1: //Adiciona profissonal
                Profissional p1 = new Profissional();
                System.out.println("************** INSERÇÃO PROFISSIONAL  ***********");
                System.out.println("Nome:");
                p1.setNomeProfissional(entrada.nextLine());
                System.out.println("Data de Nascimento:");
                p1.setDataNascimento(entrada.nextLine());
                System.out.println("Cpf:");
                p1.setCpf(entrada.nextLine());
                System.out.println("Telefone:");
                p1.setTelefone(entrada.nextInt());
                entrada.nextLine();  // corrige buffer do teclado
                p1.setAtivo(true);  //como padrão o funcionario entra ativo
                System.out.println("Salário: ");
                p1.setSalario(entrada.nextDouble());
                entrada.nextLine();  // corrige buffer do teclado 
                pr.add(p1); //adiciona na lista
                break;
             case 2: //Adiciona categoria
                System.out.println("************** INSERÇÃO CATEGORIA ***********");
                Categoria cat1 = new Categoria();
                System.out.println("Categoria: ");
                cat1.setNome(entrada.nextLine());
                c.add(cat1);
                break;
             case 3: //Adiciona procedimento
                System.out.println("************** INSIRA PROCEDIMENTOS  ***********");
                Procedimento pro = new Procedimento();
                System.out.println("Categoria:");
                pro.cate.setNome(entrada.nextLine());
                System.out.println("Digite um nome:");
                pro.setNomeProcedimento(entrada.nextLine());
                System.out.println("Digite um valor:");
                pro.setValor(entrada.nextDouble());
                entrada.nextLine();  // corrige buffer do teclado
                p.add(pro);
                break;
            case 4: //mostra categorias
                System.out.println("************** CATEGORIAS  ***********");
                for(int i=0; i < c.size(); i++)
                    c.get(i).mostra(c.get(i).getNome());
                break;
            case 5: //mostra profissional
                System.out.println("************** PROFISSOIONAIS  ***********");
                for(int i=0; i < pr.size(); i++)
                    pr.get(i).mostra(pr.get(i).getNomeProfissional(), pr.get(i).isAtivo() );
                break;
            case 6: //mostra procediemento
                System.out.println("************** PROCEDIMENTO ***********");
                for(int i=0; i < p.size(); i++)
                    p.get(i).mostra(p.get(i).getNomeProcedimento(), p.get(i).getValor(), p.get(i).cate.getNome());
                break;
            case 7: //adiciona consulta
                System.out.println("************** AGENDA CONSULTA  ***********");
                Consulta con= new Consulta();
                System.out.println("Profissional:");
                con.p.setNomeProfissional(entrada.nextLine());
                System.out.println("Procediemento:");
                con.pr.setNomeProcedimento(entrada.nextLine());
                System.out.println("Digite uma data:");
                con.setData(entrada.nextLine());
                System.out.println("Digite uma hora:");
                con.setHora(entrada.nextLine());
                con.c.setNomeCliente(c1.getNomeCliente());
                co.add(con); //adicionando na lista de consulta desse cliente
                break;
           case 8: //mostra consulta
                System.out.println("************** MOSTRA CONSULTA  ***********");
                for(int i=0; i < co.size(); i++){
                    System.out.println(" ");
                    System.out.println("*** CLIENTE: "+ co.get(i).c.getNomeCliente());
                    System.out.println("Profissonal: "+co.get(i).p.getNomeProfissional() );
                    System.out.println("Procedimento: "+co.get(i).pr.getNomeProcedimento());
                    System.out.println("Data: "+co.get(i).getData() + " Hora: " + co.get(i).getHora());
                }
                break;
           case 9:// adiciona bonificação
               System.out.println("Nome do profissional:");
               nome =entrada.nextLine();
               for(int i=0; i < pr.size(); i++)
                   if(pr.get(i).getNomeProfissional().equals(nome)){
                       System.out.println("Digite um valor para bonificação: ");
                       pr.get(i).bonifica(entrada.nextDouble());
                   }                                          
                break;
            case 10:// demite funcionario
               System.out.println("Nome do profissional:");
               nome =entrada.nextLine();
               for(int i=0; i < pr.size(); i++)
                   if(pr.get(i).getNomeProfissional().equals(nome)){                   
                       pr.get(i).demite();
                   }                                          
                break;
            }
            
        } while (op!=0);
        entrada.close();
    }
      
    public static void menu() {
        System.out.println(" ");
        System.out.println(" _______________________________");
        System.out.println("1. Adicionar profissional");
        System.out.println("2. Adicionar categoria");
        System.out.println("3. Adiciona procediemento");
        System.out.println("4. Mostrar categoria");
        System.out.println("5. Mostra profissonal");
        System.out.println("6. Mostra Procediemento");
        System.out.println("7. Agenda consulta");
        System.out.println("8. Mostra consulta");
        System.out.println("9. Adiciona bonificação");  
        System.out.println("10. Demitir funcionario");  
        System.out.println("0. Sair");
        System.out.println(" _______________________________");
        System.out.println("");
    }
    
}
