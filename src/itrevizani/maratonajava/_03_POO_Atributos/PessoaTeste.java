package itrevizani.maratonajava._03_POO_Atributos;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa(); // Instanciamento;
        p.nome = "João"; // Declarando atributos;
        p.idade = 18;
        p.sexo = 'M';

        System.out.println(p.nome); // Exibição dos atributos
    }
}
