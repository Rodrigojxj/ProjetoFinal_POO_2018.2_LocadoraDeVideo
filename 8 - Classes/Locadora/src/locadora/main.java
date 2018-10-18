package locadora;

import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locadora loca = new Locadora();
        Funcionario funci = new Funcionario();
        Gerente geren = new Gerente();
        
        while(true){
            System.out.println("\nFilmes\n"
                    + "\n[1]ADICIONAR FILME"
                    + "\n[2]EXCLUIR FILMES"
                    + "\n[3]BUSCA FILME"
                    + "\n[4]EDITAR FILME"
                    + "\n[5]VER FILMES"
                    + "\n\nClientes\n"
                    + "\n[6]ADICIONAR CLIENTE"
                    + "\n[7]EXCLUIR CLIENTE"
                    + "\n[8]BUSCA CLIENTE"
                    + "\n[9]EDITAR CLIENTE"
                    + "\n[10]VER CLIENTES"
                    + "\n\nFuncionarios\n"
                    + "\n[11]ADICIONAR FUNCIONARIO"
                    + "\n[12]EXCLUIR FUNCIONARIO"
                    + "\n[13]BUSCA FUNCIONARIO"
                    + "\n[14]EDITAR FUNCIONARIO"
                    + "\n[15]VER FUNCIONARIOS"
                + "\n\n[0]SAIR\n"
                + "");
            System.out.println("-----------------------------------------------------\n");
            switch(scan.nextInt()){
                case 1:
                    if(loca.AddFilme()){
                        System.out.println("Filme adicionado com sucesso!");
                    } else {
                        System.out.println("Falha ao adicionar Filme.");
                    }  
                    break;
                case 2:
                    loca.ExcluiFilme();
                    break;
                case 3:
                    loca.BuscaFilme();
                    break;
                case 4:
                    loca.EditaFilme();
                    break;
                case 5:
                    loca.ListaFilmes();
                    break;
                case 6:
                    if(funci.AddCliente()){
                        System.out.println("Cliente adicionado com sucesso!");
                    } else {
                        System.out.println("Falha ao adicionar cliente.");
                    }
                    break;
                case 7:
                    funci.ExcluiCliente();
                    break;
                case 8:
                    funci.BuscaCliente();
                    break;
                case 9:
                    funci.EditaCliente();
                    break;
                case 10:
                    funci.ListaClientes();
                    break;
                case 11:
                    if(geren.AddFunc()){
                        System.out.println("Funcionario adicionado com sucesso!");
                    } else {
                        System.out.println("Falha ao adicionar funcionario.");
                    }
                    break;
                case 12:
                    geren.ExcluiFuncionario();
                    break;
                case 13:
                    geren.BuscaFuncionario();
                    break;
                case 14:
                    geren.EditaFuncionario();
                    break;
                case 15:
                    geren.ListaFunc();
                    break;
                case 0:
                    System.exit(0);
                default: System.exit(1);
            }   
        }
    }
}
