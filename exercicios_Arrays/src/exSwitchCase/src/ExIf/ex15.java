package ExIf;
 
import java.util.Scanner;
 
public class ex15 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite o peso (kg): ");
        double peso = scanner.nextDouble();
 
        System.out.print("Digite a altura (m): ");
        double altura = scanner.nextDouble();
 
        double imc = peso / (altura * altura);
 
        if (imc < 18.5) {
            System.out.println("Magreza / Abaixo do peso");
        } else if (imc < 25.0) {
            System.out.println("Peso normal / Saudável");
        } else if (imc < 30.0) {
            System.out.println("Sobrepeso (Pré-obesidade)");
        } else if (imc < 35.0) {
            System.out.println("Obesidade Grau I");
        } else if (imc < 40.0) {
            System.out.println("Obesidade Grau II");
        } else {
            System.out.println("Obesidade Grau III (Grave)");
        }
 
        scanner.close();
    }
}