import java.util.Locale;
import java.util.Scanner;

public class Uri1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tempo = sc.nextInt();
		int velocidade = sc.nextInt();
		double comb = tempo * velocidade / 12.0;

				System.out.printf("%.3f%n", comb);

		sc.close();

	}

}
