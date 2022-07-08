package itrevizani.maratonajava._9_POO_Classes_Abstratas;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
