import java.util.Scanner;

public class Teste02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a palavra/frase que deseja: ");
        String palavra = scanner.nextLine();

        int contador = contarLetrasa(palavra);

        System.out.println("A Quantidade de letras 'a' em minúsculo são : " + contador);
    }

    //Contador de "a"
    public static int contarLetrasa(String palavra) {
        int contador = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c == 'a') {
                contador++;
            }
        }
        return contador;
    }
}