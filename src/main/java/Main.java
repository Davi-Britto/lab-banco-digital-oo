
public class Main {

	public static void main(String[] args) {
		Banco bancoDio = new Banco("Banco da Dio");

		Cliente venilton = new Cliente();
		venilton.setNome("Carlos");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		bancoDio.inserirConta(cc);
		bancoDio.inserirConta(poupanca);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		System.out.println("Contas antes de deletar:");
		for (IConta conta : bancoDio.getContas()) {
			conta.imprimirExtrato();
		}

		bancoDio.deletarConta(cc);

		System.out.println("Contas após deletar:");
		for (IConta conta : bancoDio.getContas()) {
			conta.imprimirExtrato();
		}
	}

}
