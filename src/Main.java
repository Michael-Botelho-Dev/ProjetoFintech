import projeto.fintech.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Usuario usuario = new Usuario();
        Login login = new Login();
        Recebimento recebimento = new Recebimento();
        Despesa despesa = new Despesa();
        Extrato extrato = new Extrato();

        int op;

        do {
            System.out.println("Escolha um opçao:"+
                    "\n1- Fazer Cadastro.\n"+
                    "\n2- Fazer Login.\n"+
                    "\n3- Registrar Receita.\n"+
                    "\n4- Registrar Despesa.\n"+
                    "\n5- Extrato.\n"+
                    "\n0- Sair.\n");

            op = sc.nextInt();

            switch (op){
                case 1:
                    System.out.println("Digite o seu nome: ");
                    String nome = sc.next() + sc.nextLine();

                    System.out.println("Data Nascimento: ");
                    String nascimento = sc.next() + sc.nextLine();

                    System.out.println("Digite seu CPF: ");
                    String cpf = sc.next() + sc.nextLine();

                    System.out.println("Digite seu E-mail: ");
                    String email = sc.next() + sc.nextLine();

                    System.out.println("Digite seu Celular: ");
                    String celular = sc.next() + sc.nextLine();

                    System.out.println("Digite sua Senha: ");
                    String password = sc.next() + sc.nextLine();

                    usuario.realizarCadastro();
                    break;
                case 2:
                    System.out.println("Digite seu E-mail: ");
                    String email2 = sc.next();

                    System.out.println("Digite sua Senha: ");
                    String password2 = sc.next();

                    login.fazerLogin();
                    break;
                case 3:
                    System.out.println("Digite o Valor a adicionar na Receita: ");
                    double valor = sc.nextDouble();
                    recebimento.adicionarReceita(valor);
                    extrato.adicionarReceita(valor);
                    break;
                case 4:
                    System.out.println("Digite o valor a adicionar na Despesa: ");
                    valor =sc.nextDouble();
                    despesa.adicionarDespesa(valor);
                    extrato.adicionarDespesa(valor);
                    break;
                case 5:
                    extrato.exibirExtrato();
                    break;
                case 0:
                    System.out.println("Saindo do Programa!");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }while (op !=0);
    }
}