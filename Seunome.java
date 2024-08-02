import java.util.Scanner;

public class Seunome {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Escreva seu nome: ");
        String nome = input.nextLine();

        System.out.printf("Seu nome é: %s%n", nome);
    }
}
