package itrevizani.maratonajava._8_POO_Enumeracao;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public enum TipoPagamento {
        DEBITO, CREDITO
    }

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt=" + tipoCliente.getVALOR() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
