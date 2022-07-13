package itrevizani.maratonajava._12_POO_Exception;

import itrevizani.maratonajava._12_POO_Exception.dominio.Funcionario;
import itrevizani.maratonajava._12_POO_Exception.dominio.LoginInvalidoException;
import itrevizani.maratonajava._12_POO_Exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
