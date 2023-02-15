package br.com.maquinasbrito.view;

import java.sql.SQLException;
import java.util.List;

import br.com.maquinasbrito.controller.ClientController;
import br.com.maquinasbrito.model.ClientModel;

public class SearcherClientTest {
    public static void main(String[] Args) throws SQLException{
        ClientController clientController = new ClientController();
        ClientModel clientModel = new ClientModel(2,"joãozinho", "Santos", "11949302531", "1112345678");

        ClientModel returnClient = clientController.searcherClientId(clientModel);
        
        //ClientModel returnClient = clientController.searcherClient(1);
        System.out.println(returnClient.getId());
        System.out.println(returnClient.getName());
        System.out.println(returnClient.getLastname());
        System.out.println(returnClient.getCellPhone());
        System.out.println(returnClient.getTelephone());
        
        
        //List<ClientModel> clientsList = clientController.searcherAllClient();
        //clientsList.stream().forEach(cl -> System.out.println(cl));
    }
}
