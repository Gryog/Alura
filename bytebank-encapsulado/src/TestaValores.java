
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(12312312);
		
		Conta conta2 = new Conta(1338,24227);
		Conta conta3 = new Conta(1564,789456);
		
		System.out.println(Conta.getTotal());
	}

}
