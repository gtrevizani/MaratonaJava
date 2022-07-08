package itrevizani.maratonajava._11_POO_Polimorfismo.test;

import itrevizani.maratonajava._11_POO_Polimorfismo.modelo.Computador;
import itrevizani.maratonajava._11_POO_Polimorfismo.modelo.Produto;
import itrevizani.maratonajava._11_POO_Polimorfismo.modelo.Tomate;
import itrevizani.maratonajava._11_POO_Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
