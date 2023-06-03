import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teste03 {

    public static void main(String[] args) {

        // Gerar o vetor de números aleatórios
        int[] vetor = new int[100];
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
        }

        // Inicializar as listas para armazenar os valores
        List<Integer> listaImpares = new ArrayList<>();
        List<Integer> listaRestoDivisao = new ArrayList<>();

        // Percorrer o vetor e separar os valores nas listas adequadas
        for (int numero : vetor) {
            if (numero % 2 != 0) {
                listaImpares.add(numero);
            } else {
                listaRestoDivisao.add(numero % 5);
            }
        }

        // Converter as listas em vetores
        int[] vetorImpares = listaImpares.stream().mapToInt(Integer::intValue).toArray();
        int[] vetorRestoDivisao = listaRestoDivisao.stream().mapToInt(Integer::intValue).toArray();

        // Exibir os valores dos vetores
        System.out.println("Vetor de números ímpares: " + arrayToString(vetorImpares));
        System.out.println("Vetor de resto da divisão por 5 dos números pares: " + arrayToString(vetorRestoDivisao));
    }

    // Função auxiliar para converter um array em uma string formatada
    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
