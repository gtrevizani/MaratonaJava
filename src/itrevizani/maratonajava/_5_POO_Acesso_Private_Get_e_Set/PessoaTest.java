package itrevizani.maratonajava._5_POO_Acesso_Private_Get_e_Set;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jiraya");
        pessoa.setIdade(18);
        pessoa.setSalarios(new double[]{1500,3000,5000});

        pessoa.imprime();
    }
}
