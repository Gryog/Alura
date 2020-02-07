
public class TesteContas {
	public static void main(String[] args) {
		
		Conta contaM = new Conta(1331, 123456);
		
		contaM.deposita(200.0);
		
		System.out.println(contaM.getSaldo());
		
		contaM.setAgencia(570);
		
		System.out.println(contaM.getAgencia());
		
		contaM.saca(30.0);
		
		System.out.println(contaM.getSaldo());
		
		System.out.println("O total de contas é "+ Conta.getTotal());
	}

}
