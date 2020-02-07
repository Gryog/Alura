
public class Fibonnaci {
	public static void main(String[] args) {
		
		long temp1 = 1;
		long temp2 = 0;
		long fib = 0;
		long X = 0;
		
		while(X <= 200) {
			fib = temp1 + temp2;
			temp2 = temp1;
			temp1 = fib;
			X++;
			System.out.println(fib);
		}
	}

}
