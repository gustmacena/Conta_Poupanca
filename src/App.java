import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*criar um objeto tipo conta poupanca */
        ContaPoupaca conta = new ContaPoupaca();
        Scanner leia = new Scanner(System.in);

        System.out.println("Bem vindo ao banco senhor(a)");
        System.out.print("Digite sua agencia:");
        conta.agencia = leia.nextLine();

        System.out.print("Digite sua conta:");
        conta.numero = leia.nextLine();

        System.out.print("Digite seu Saldo:");
        conta.saldo = leia.nextFloat();

        System.out.print("Digite a taxa:");
        conta.taxa = leia.nextFloat();

        conta.imprimeDados();
        System.out.print("Digite o valor a ser depositado senhor(a)");
        float valor = leia.nextFloat();
        conta.depositar(valor);

        conta.imprimeDados();

        valor = conta.caulculaRendimento();
        System.out.println("rendimento: "+valor);

        conta.depositar(valor);

        conta.imprimeDados();

        leia.close();
    }
}
