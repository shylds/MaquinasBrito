package br.com.maquinasbrito.view;

import java.sql.SQLException;

import br.com.maquinasbrito.controller.ClientController;
import br.com.maquinasbrito.model.ClientModel;

public class DeleterClient {
    public static void main(String[] Args) throws SQLException{
        ClientController clientController = new ClientController();
        ClientModel clientModel = new ClientModel(4);

        clientController.deleterClient(clientModel);
    }
}
