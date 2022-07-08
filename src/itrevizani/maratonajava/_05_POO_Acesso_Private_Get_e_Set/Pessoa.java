package itrevizani.maratonajava._05_POO_Acesso_Private_Get_e_Set;

import java.util.Arrays;

public class Pessoa {
    private String nome; // Modificador de acesso privado, só permite referência com Getters and Setters.
    private int idade;
    private double[] salarios;

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprime(){
        System.out.println(getNome());
        System.out.println(getIdade());
        System.out.println(Arrays.toString(getSalarios()));
    }
}
