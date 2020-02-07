
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario guilherme = new Gerente();
		guilherme.setNome("Guilherme");
		guilherme.setCpf("125.345.678-98");
		guilherme.setSalario(2600.00);
		
		
		System.out.println(guilherme.getNome());
		System.out.println(guilherme.getBonificacao());
	}

}
