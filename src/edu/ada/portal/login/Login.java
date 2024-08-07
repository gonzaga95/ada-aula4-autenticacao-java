package edu.ada.portal.login;

import edu.ada.portal.constants.Constants;

public class Login {

    public String autenticacao(String usuario, String senha) {

        if (usuario.equals(MockDataBase.adminUser) && senha.equals(MockDataBase.adminPassword)) {
            return "Logado com sucesso";
        }

        return Constants.MENSAGEM_ERRO_LOGIN;
    }
}
