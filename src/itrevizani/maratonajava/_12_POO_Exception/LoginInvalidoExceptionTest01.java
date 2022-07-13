package itrevizani.maratonajava._12_POO_Exception;

import itrevizani.maratonajava._12_POO_Exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e){
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";

        System.out.print("Usuário: " );
        String user = scanner.nextLine();
        System.out.print("Senha: " );
        String senha = scanner.nextLine();
        if(!usernameDB.equals(user) || !senhaDB.equals(senha)){
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }
        System.out.println("Usuário logado com sucesso");
    }
}
