import java.util.Locale;
import java.util.Scanner;

public class Uri1005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
	
		double media = (A * 0.35 + B * 0.75) / 1.1;

		System.out.printf("MEDIA = %.5f%n", media);

		sc.close();

	}

}
