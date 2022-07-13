package itrevizani.maratonajava._14_POO_String;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = " Luffy";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("f", "l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.substring(0,3));
        System.out.println(nome.trim());
    }
}
