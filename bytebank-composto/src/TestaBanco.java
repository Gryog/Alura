
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente Guilherme = new Cliente();
		Guilherme.nome = "Guilherme Lima";
		Guilherme.cpf = "123.456.789-101";
		Guilherme.profissao = "Estagiario";
		
		Conta contaDoGuilherme = new Conta();
		contaDoGuilherme.deposita(100);
		
		contaDoGuilherme.titular = Guilherme;
		System.out.println(contaDoGuilherme.titular.nome);
	}

}
