package itrevizani.maratonajava._11_POO_Polimorfismo.test;

import itrevizani.maratonajava._11_POO_Polimorfismo.repositorio.Repositorio;
import itrevizani.maratonajava._11_POO_Polimorfismo.servico.RepositorioBancoDeDados;
import itrevizani.maratonajava._11_POO_Polimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}
