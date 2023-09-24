import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeCliente = "Vitória Ferreira";
        String tipoConta = "Corrente";
        double saldo = 2000.00;
        int opcao = 0;

        System.out.println("*************************************");
        System.out.println("Cliente: "+ nomeCliente);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("*************************************");

        String menu = """
                *** Digite uma opção: ***
                1 - Consulte seu saldo
                2 - Faça uma transferência
                3 - Receba uma transferência
                4 - Saia do menu
                
                """;


        Scanner leitura = new Scanner(System.in);

        while(opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();


            if (opcao == 1){
                System.out.println("O seu saldo atual é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor da transferência?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Transferência Recebida: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção Inválida! Tente novamente.");

            }
        }
    }
}