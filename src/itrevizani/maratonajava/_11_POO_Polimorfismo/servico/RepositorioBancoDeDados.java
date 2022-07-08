package itrevizani.maratonajava._11_POO_Polimorfismo.servico;

import itrevizani.maratonajava._11_POO_Polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar(){
        System.out.println("Salvando no banco de dados");
    }
}
