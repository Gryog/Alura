
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("O saldo da primeira conta e "+primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("O saldo da primeira conta e "+primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		System.out.println("O saldo da segunda conta e "+segundaConta.saldo);
		
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesma conta");
		} else {
			System.out.println("Contas diferentes");
		}
		
		if(primeiraConta.saldo == segundaConta.saldo) {
			System.out.println("São o mesmo saldo");
		} else {
			System.out.println("Saldos diferentes");
		}
	}

}
