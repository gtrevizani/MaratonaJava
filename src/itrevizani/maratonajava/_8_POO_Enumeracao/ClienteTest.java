package itrevizani.maratonajava._8_POO_Enumeracao;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tester", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Scripter", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
    }
}
