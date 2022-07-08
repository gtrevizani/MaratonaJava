package itrevizani.maratonajava._11_POO_Polimorfismo.test;

import itrevizani.maratonajava._11_POO_Polimorfismo.modelo.Computador;
import itrevizani.maratonajava._11_POO_Polimorfismo.modelo.Televisao;
import itrevizani.maratonajava._11_POO_Polimorfismo.modelo.Tomate;
import itrevizani.maratonajava._11_POO_Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
