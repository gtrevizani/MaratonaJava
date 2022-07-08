package itrevizani.maratonajava._11_POO_Polimorfismo.servico;

import itrevizani.maratonajava._11_POO_Polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar(){
        System.out.println("Salvando em um arquivo");
    }
}
