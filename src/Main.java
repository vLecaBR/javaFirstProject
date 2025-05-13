import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double saldo = 1500;
        int opcao = 0;
        double deposito = 0;
        double saque = 0;

        while (opcao != 4){
        System.out.printf("----------------------------------------\n");
        System.out.printf("Bem vindo a sua conta bancária\n");
        System.out.printf("Seu saldo atual é de R$" + saldo + "\n");
        System.out.printf("----------------------------------------\n");

        System.out.printf("----------------------------------------\n");
        System.out.printf("Qual ação deseja executar?\n");
        System.out.printf("1) Depositar dinheiro\n");
        System.out.printf("2) Sacar dinheiro\n");
        System.out.printf("3) Consultar saldo\n");
        System.out.printf("4) Sair\n");
        System.out.printf("----------------------------------------\n");

        Scanner leitura = new Scanner(System.in);
        opcao = leitura.nextInt();

        if (opcao == 1){
            System.out.println("Quanto você deseja depositar? \n");
            Scanner valorDeposito = new Scanner(System.in);
            deposito = valorDeposito.nextDouble();

            if (deposito < 0) {
                System.out.println("Você não pode depositar um valor negativo.");
                continue;
            }
            if (deposito == 0) {
                System.out.println("Você não pode depositar zero.");
                continue;
            }
            saldo += deposito;
            System.out.println("O valor atual na sua conta é de: " + saldo);

        } else if (opcao == 2) {
            System.out.println("Quanto você deseja Sacar? \n");
            Scanner valorSaque = new Scanner(System.in);
            saque = valorSaque.nextDouble();

            if (saque < 0) {
                System.out.println("Você não pode sacar um valor negativo.");
                continue;
            }
            if (saque > saldo) {
                System.out.println("Você não pode sacar mais do que o saldo disponível.");
                continue;
            }
            if (saque == 0) {
                System.out.println("Você não pode sacar zero.");
                continue;
            }
            saldo -= saque;
            System.out.println("O valor atual na sua conta é de: " + saldo);

        } else if (opcao == 3) {
            System.out.println("O valor atual na sua conta é de: " + saldo);

        } else if(opcao == 4){
            System.out.println("Obrigado por usar nosso sistema, até logo!");
        }else{
            System.out.println("Opção inválida, tente novamente");

        }

    }}
}