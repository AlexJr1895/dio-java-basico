import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Transacoes transacoes = new Transacoes();


        try (Scanner scanner = new Scanner(System.in)) {
            String agencia, nomeCliente;
            int numero;

            System.out.println("Por favor, digite o número da conta: ");
            numero = scanner.nextInt();
            System.out.println("Por favor, digite a agência da conta: ");
            agencia = scanner.next();
            System.out.println("Por favor, digite o nome do titular da conta: ");
            nomeCliente = scanner.next();
            
            System.out.println("Conta criada com sucesso!");

            int opcao = 0;

            while (opcao != 4) {

                System.out.println("\nEscolha uma operação:");
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Consultar saldo");
                System.out.println("4 - Sair");

                opcao = scanner.nextInt();

                if (opcao == 1) {

                    System.out.println("Digite o valor para depósito:");
                    double valor = scanner.nextDouble();

                    transacoes.depositar(valor);

                } else if (opcao == 2) {
                    System.out.println("Digite o valor para saque:");
                    double valor = scanner.nextDouble();
                    if(transacoes.sacar(valor)){
                        System.out.println("Saque realizado com sucesso.");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                } else if (opcao == 3) {

                    System.out.println("Saldo atual: " + transacoes.consultarSaldo());
                }
            }
   
            System.out.println("Programa encerrado.");
        }
    }
}
