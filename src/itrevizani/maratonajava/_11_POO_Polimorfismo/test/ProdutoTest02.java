package itrevizani.maratonajava._11_POO_Polimorfismo.test;

import itrevizani.maratonajava._11_POO_Polimorfismo.modelo.Computador;
import itrevizani.maratonajava._11_POO_Polimorfismo.modelo.Produto;
import itrevizani.maratonajava._11_POO_Polimorfismo.modelo.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("----------------");

        Produto produto2 = new Tomate("Americano", 30);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
