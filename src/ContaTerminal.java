import java.util.Scanner;

public class ContaTerminal {


    public static void main (String[] args) {

        Integer numeroConta;
        String agencia = "067-8";
        String nameCliente;
        Double saldo;
        Scanner scanner = new Scanner(System.in);



        System.out.println("Por favor, digite o número da Agencia: ");

        agencia = scanner.next();

        System.out.println("Por favor digite o nuemro da Conta: ");

        numeroConta = scanner.nextInt();

        System.out.println("Por favor digite o nome do cliente: ");

        nameCliente = scanner.next();

        System.out.println("Por favor digite o saldo da conta: ");

        saldo = scanner.nextDouble();

        System.out.println("Ola " + nameCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é: " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já esta disponivel para saque");



    }
    
}
