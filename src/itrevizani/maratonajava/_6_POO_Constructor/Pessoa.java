package itrevizani.maratonajava._6_POO_Constructor;

public class Pessoa {
    private final String nome; // Atributos
    private final String cpf;

    public Pessoa(String nome, String cpf) { // Constructor
        this.nome = nome;
        this.cpf = cpf;
    }


    public void exibir(){ // Método
        System.out.println("Nome: " + getNome() + "\nCPF: " + getCpf());
    }

    public String getNome() { // Getters
        return nome;
    }

    public String getCpf() { // Getters
        return cpf;
    }

}
