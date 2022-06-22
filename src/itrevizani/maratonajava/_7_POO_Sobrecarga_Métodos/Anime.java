package itrevizani.maratonajava._7_POO_Sobrecarga_Métodos;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public void imprime(){
        System.out.println(getNome());
        System.out.println(getTipo());
        System.out.println(getEpisodios());
        System.out.println(getGenero());
    }

    public void setters(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void setters(String nome, String tipo, int episodios, String genero){
        this.setters(nome, tipo, episodios);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

}
