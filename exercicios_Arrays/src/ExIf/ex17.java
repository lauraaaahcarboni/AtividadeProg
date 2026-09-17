package ExIf;
 
import java.util.Scanner;
 
public class ex17 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        final String USUARIO_CORRETO = "admin";
        final String SENHA_CORRETA = "1234";
 
        System.out.print("Digite o usuário: ");
        String usuario = scanner.next();
 
        System.out.print("Digite a senha: ");
        String senha = scanner.next();
 
        if (!usuario.equals(USUARIO_CORRETO)) {
            System.out.println("Usuário inexistente.");
        } else {
            if (senha.equals(SENHA_CORRETA)) {
                System.out.println("Acesso permitido.");
            } else {
                System.out.println("Senha incorreta.");
            }
        }
 
        scanner.close();
    }
}