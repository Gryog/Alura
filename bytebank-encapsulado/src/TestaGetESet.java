
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		//conta.numero = 1337; Nao compila
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente guilherme = new Cliente();
		
		guilherme.setNome("Guilherme Lima");
		
		
		conta.setTitular(guilherme);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Estagiario");
		
		System.out.println(conta.getTitular().getProfissao());
	}

}
