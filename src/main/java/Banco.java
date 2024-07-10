import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
	}

	public void inserirConta(Conta conta){
		System.out.println("Conta " + conta.getNumero() + " adicionada!");
		contas.add(conta);
	}

	public void deletarConta(Conta conta){
		for (Conta c : contas){
			if(conta.equals(c)){
				contas.remove(c);
			}
		}
		System.out.println("Conta Removida");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
