package ativ2;

public class ex3 {
	public static void main(String[] args) {
        double dist = 420.0; 
        double litros = 35.0;   

        // Fórmulas solicitadas
        double cMedio = dist / litros;
        double litro100k = 100 / cMedio;

        // Exibe resultados
        System.out.println("Consumo médio: " + cMedio + " km/l");
        System.out.println("Litros para 100km: " + litro100k);
    }
}
