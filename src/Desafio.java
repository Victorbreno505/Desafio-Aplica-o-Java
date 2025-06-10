import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Lex";
        String tipoConta = "Corrente";
        double saldo = 10.00;
        int opcao = 0;


        System.out.println("******************************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atuial: " + saldo);
        System.out.println("\n ******************************************");

        String menu = """
                ** Digite sua opcao **
                1 - Consultar Saldo
                2 - transferir Valor
                3 - Receber Valor
                4 - Sair 
                
                """;
        Scanner leitura = new Scanner(System.in);
        while (opcao != 4) {

            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado eh " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Nao ha saldo para realizar a transferencia");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3){
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opcao invalida!");
            }
        }
    }
}