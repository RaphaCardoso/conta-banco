import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor digite o nome do cliente:");
        String nome = sc.next();

        System.out.println("Por favor digite o número da agência:");
        String agencia = sc.next();

        System.out.println("Por favor digite o número da conta:");
        int conta = sc.nextInt();

        System.out.println("Por favor digite o saldo:");
        double saldo = sc.nextDouble();

        String mensagem = "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque";

        System.out.println(mensagem);

        sc.close();
    }
}
