package itrevizani.maratonajava._02_POO_Arrays;

import java.util.Scanner;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        String[][] dias = new String[2][]; // Array de dois indíces;
        dias[0] = new String[5]; // 1° índice com 5 elementos;
        dias[1] = new String[3]; // 2° índice com 3 elementos;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < dias.length; i++) { // For que percorre para ler;
            System.out.println("{" + (i + 1) + " ° ARRAY}");
            for (int y = 0; y < dias[i].length; y++) {
                System.out.print((y + 1) + " ° dia: ");
                dias[i][y] = scanner.nextLine();
            }
        }

        System.out.println("-------------------------------------------------");

        for (int i = 0; i < dias.length; i++) { // For que percorre para escrever;
            System.out.println("{" + (i + 1) + " ° ARRAY}");
            for (int y = 0; y < dias[i].length; y++) {
                System.out.println((y + 1) + " ° dia: " + dias[i][y]);
            }
        }
    }
}
