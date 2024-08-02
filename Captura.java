import java.util.Scanner;
import java.util.Locale;

public class Captura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu sexo (M/F): ");
        char sexo = scanner.next().charAt(0);

        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Salário: R$ %.2f\n", salario);
        System.out.printf("Idade: %d anos\n", idade);
        System.out.printf("Altura: %.2f metros\n", altura);
        System.out.printf("Sexo: %c\n", sexo);

    }
}
