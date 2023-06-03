import java.util.Scanner;

public class Teste01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o valor do quilo: ");
        float valorQuilo = scanner.nextFloat();

        System.out.print("Digite a tara do prato em gramas: ");
        float taraPratoGramas = scanner.nextFloat();

        System.out.print("Digite o peso total do prato (refeição) em gramas: ");
        float pesoPratoGramas = scanner.nextFloat();

        float taraPrato = taraPratoGramas / 1000;// Convertendo gramas para quilogramas
        float pesoPrato = pesoPratoGramas / 1000;// Convertendo gramas para quilogramas

        float pesoAlimento = taraPrato  - pesoPrato ; // Descontando a tara do prato no peso da refeição
        float valorPrato = pesoAlimento * valorQuilo; // Calculando o valor a ser pago
        valorPrato = Math.abs(valorPrato);


        // Saida de informações
        System.out.println("------------------ Recibo ---------------");
        System.out.println("O valor do quilo e de: R$"+ valorQuilo);
        System.out.println("A tara do prato é de: "+ taraPrato +"Kg");
        System.out.println("O peso da comida é: "+ pesoPrato + "Kg");
        System.out.printf("Valor a pagar : R$%.2f%n", valorPrato);
        System.out.println("-----------------------------------------");
    }
}