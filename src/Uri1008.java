import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int qtdeHoras = sc.nextInt();
		double valorHora = sc.nextDouble();

		double salario = qtdeHoras * valorHora;
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		sc.close();
	}

}
