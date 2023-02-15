package br.com.maquinasbrito.view;


import java.sql.SQLException;

import br.com.maquinasbrito.controller.ClientController;
import br.com.maquinasbrito.model.ClientModel;

public class SaveClient{
    public static void main(String[] Args) throws SQLException{
        ClientController clientController = new ClientController();

        ClientModel returnClient = clientController.saveClient( "Elison", "Santos", "11912375678", "1112375678");

        System.out.println("O(A) " + returnClient.getName() + " " + returnClient.getLastname() + " cadastrado(a) com sucesso com o identificador: " + returnClient.getId());

    }
}