package itrevizani.maratonajava._4_POO_Metodos;

public class Calculadora {

    public void somaArrays(int...numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println("1° teste (Método com arrays): " + soma);
    } // Método com arrays

    public void somaDoisNumeros(){
        System.out.println("2° teste (Método): " + (10 + 10));
    } // Método

    public void multiplicaDoisNumeros(int n, int x){
        System.out.println("3° teste (Método com parâmetro): " + n * x);
    } // Método com parâmetro

    public double divideDoisNumeros(double n, double x){
        if(n>0){
            return n / x;
        }
        return n / x;
    } // Método com retorno
}
