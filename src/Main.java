import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Frederico Augusto";
        String tipoDeConta = "Corrente";
        Scanner leitura = new Scanner(System.in);
        double saldo = 3559.09;
        double valor;
        int opcao;

        System.out.println("Bem vindo ao banco Alpha!");
        String dadosCliente = String.format("""
                ***********************
                Dados iniciais do cliente:

                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$ %.2f
                ***********************
                """, nome, tipoDeConta, saldo);
        String menuDeOperacoes = """
                Operações

                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                """;
        System.out.println(dadosCliente);

        do {
            System.out.println(menuDeOperacoes + "\nDigite a opção correspondente a operação desejada: ");
            opcao = leitura.nextInt();
            if (opcao == 1) {
                System.out.println("Saldo atual: R$" + saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber:");
                valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado: R$" + saldo);
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir:");
                valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há saldo suficiente para fazer essa transferência!");
                    System.out.println("Operação cancelada!");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado: R$" + saldo);
                }
            } else if (opcao == 4) {
                System.out.println("Encerrando conexão");
            } else {
                System.out.println("Operação inválida. Insira um valor conforme a tabela de operações!");
            }
            System.out.println("*************************************\n\n");
        } while (opcao != 4);
    }
}