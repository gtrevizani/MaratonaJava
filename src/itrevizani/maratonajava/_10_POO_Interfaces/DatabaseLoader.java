package itrevizani.maratonajava._10_POO_Interfaces;

public class DatabaseLoader implements DataLoader, DataRemover{
    // private -> default -> protected -> public
    @Override
    public void load(){
        System.out.println("Carregando dados do banco de dados");
    }
    @Override
    public void remove(){
        System.out.println("Removendo dados do banco de dados");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
