
public class TestaValores {
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		System.out.println(segundo);
		
		
		String saudacao = "Ola, meu nome e ";
		String nome = "Romulo ";
		String continuacao = "e minha idade e ";
		int idade = 100;
		String ano = " anos.";
		
		System.out.println(saudacao+nome+continuacao+idade+ano);
	}

}
