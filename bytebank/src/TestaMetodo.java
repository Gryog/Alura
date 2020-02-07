
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoGuilherme = new Conta();
		contaDoGuilherme.saldo = 100;
		contaDoGuilherme.deposita(50);
		System.out.println(contaDoGuilherme.saldo);
		
		
		boolean conseguiuRetirar = contaDoGuilherme.saca(20);
		System.out.println(contaDoGuilherme.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if(contaDaMarcela.transfere(300, contaDoGuilherme)) {
			System.out.println("Transferencia feita com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoGuilherme.saldo);
		
		contaDoGuilherme.titular = "Guilherme Lima";
		System.out.println(contaDoGuilherme.titular);
	}

}
