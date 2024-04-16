import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Digite uma senha: ");
        String senha = scanner.nextLine();

        try {
            validarSenha(senha);
            System.out.println("Senha valida");
        } catch (SenhaErradaException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void validarSenha(String senha) {
        if (senha.length() < 8) {
            throw new SenhaErradaException("A senha tem que ter ao menos 8 caracteres.");
        }
    }
}
