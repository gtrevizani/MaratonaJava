package itrevizani.maratonajava._4_POO_Metodos;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora c = new Calculadora(); // Instanciamento
        int[] numeros = new int [5];
        c.somaArrays(4,4,8,6);
        c.somaDoisNumeros(); // Chamada do Método

        c.multiplicaDoisNumeros(10, 5); // Chamada do Método com Parâmetro

        double result = c.divideDoisNumeros(8.5, 2); // Chamada do Método com retorno;

        System.out.println("4° teste (Método com retorno): " + result); // Variável para pegar o retorno do Método.
    }
}
