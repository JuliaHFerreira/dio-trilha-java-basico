import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//leitura número da conta
		System.out.println("Por favor, digite o número da conta.");
		int numConta = sc.nextInt();
		sc.nextLine();
		//leitura da agência
		System.out.println("Por favor, digite o número da Agência.");
		String agencia = sc.nextLine();
		//leitura do nome do cliente
		System.out.println("Por favor, digite o nome do cliente da conta.");
		String nomeCliente = sc.nextLine();
		//leitura saldo
		System.out.println("Por favor, digite saldo da conta.");
		Double saldo = sc.nextDouble();
		
		System.out.println();
		System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numConta + " e seu saldo " + saldo + " já está disponível para saque");

		sc.close();
	}
}
