import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod1 = sc.nextInt();
		int qtde1 = sc.nextInt();
		double valor1 = sc.nextDouble();

		int cod2 = sc.nextInt();
		int qtde2 = sc.nextInt();
		double valor2 = sc.nextDouble();

		double valorTotal = (qtde1 * valor1) + (qtde2 * valor2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
		sc.close();
	}
}
