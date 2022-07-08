package itrevizani.maratonajava._11_POO_Polimorfismo.servico;

import itrevizani.maratonajava._11_POO_Polimorfismo.modelo.Computador;
import itrevizani.maratonajava._11_POO_Polimorfismo.modelo.Produto;
import itrevizani.maratonajava._11_POO_Polimorfismo.modelo.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        if(produto instanceof Tomate) {
            String dataValidade = ((Tomate) produto).getDataValidade();

            System.out.println(dataValidade);
        }
    }
}
