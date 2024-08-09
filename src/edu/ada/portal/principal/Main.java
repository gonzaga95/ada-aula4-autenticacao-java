package edu.ada.portal.principal;
import edu.ada.portal.login.Login;

public class Main {
    public static void main(String[] args) {

        Login login = new Login();
        System.out.println( login.autenticacao("admin", "teste"));
    }
}
