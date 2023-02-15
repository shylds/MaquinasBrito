package br.com.maquinasbrito.view;

import java.sql.SQLException;

import br.com.maquinasbrito.controller.ClientController;
import br.com.maquinasbrito.model.ClientModel;

public class UpdaterClient {
    public static void main(String[] Args) throws SQLException{
        ClientController clientController =  new ClientController();

        ClientModel returnClient =  clientController.updaterClientId(3,"Beatriz");

        System.out.println(returnClient.getName());
    }
}
