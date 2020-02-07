
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.00);
		
		EditorVideo e1 = new EditorVideo();
		e1.setNome("Jorge");
		e1.setSalario(2500.00);
		
		Designer d1 = new Designer();
		d1.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(e1);
		controle.registra(d1);
		
		System.out.println(controle.getSoma());
		
		//String nome = g1.getNome();
		
		//System.out.println(nome);
		
/*		
		Funcionario g1 = new Gerente();
		
		g1.autentica(2222);
*/
	}

}
