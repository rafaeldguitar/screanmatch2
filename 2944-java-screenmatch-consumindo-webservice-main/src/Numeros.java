import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Escolha mais um: ");
        int numero2 = scanner.nextInt();

        try {
            int resultado = numero1 / numero2;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro, divisão por zero não permitida.");
        }
    }
}