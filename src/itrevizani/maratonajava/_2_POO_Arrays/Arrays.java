package itrevizani.maratonajava._2_POO_Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] testes = new int[]{1,2,3,4}; // Com valores
        int[] idades = new int[4]; // Sem valores

        for(int i = 0; i< idades.length; i++){ // For para inserção
            System.out.print(i + ": ");
            idades[i] = scanner.nextInt();
        }
        for (int idade : idades) { // For para exibição
            System.out.println("Codiguin: " + idade);
        }

        for (int teste : testes) { // For para exibição
            System.out.println("testes: " + teste);
        }

    }
}
