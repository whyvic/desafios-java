import java.util.Scanner;
public class Desafio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*******************************");
		System.out.println("Dados iniciais do cliente: \n\n");
		
		System.out.println("Digite o nome do(a) cliente: ");
		String nome =  scanner.nextLine();
		
		String conta = "Corrente";
		
		Double saldoInicial = 0.0;
		
	    String resultadoFormatado = String.format("Nome: %s\nConta: %s\nSaldo Inicial: R$%.2f", nome, conta, saldoInicial);
	    System.out.println(resultadoFormatado);
		System.out.println("\n*******************************");
		
		System.out.println("Operações do sistema");
		
		int operações = 0;
		
		String menu = """
				\n**Digite sua opção**
				1 - Consultar saldo
				2 - Receber valor
				3 - Transferir valor
				4 - Sair
				""";
		
		while(operações !=4) {
			System.out.println(menu);
			operações = scanner.nextInt();
			if(operações == 1) {
				//double saldo = saldoInicial;
				System.out.println(saldoInicial);
			}else if(operações == 2) {
				System.out.println("Informe o valor a receber: ");
				double valorAReceber = scanner.nextDouble();
				saldoInicial += valorAReceber;
				System.out.println("Saldo atualizado: R$" + saldoInicial);
			}else if(operações == 3) {
				System.out.println("Informe o valor que deseja transferir: ");
				double valorATransferir = scanner.nextDouble();
				if(valorATransferir > saldoInicial) {
					System.out.println("Não foi possivel realizar a transferencia. Insira um valor menor e tente novamente.");
				}else {
					saldoInicial -= valorATransferir;
				}
			}else if(operações == 4) {
				System.out.println("O sistema foi finalizado. Até mais!");
			}
		}
		
	}


}
