package itrevizani.maratonajava._8_POO_Enumeracao;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tester", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Scripter", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
