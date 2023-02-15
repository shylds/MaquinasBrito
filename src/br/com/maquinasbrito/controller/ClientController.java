package br.com.maquinasbrito.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.maquinasbrito.dao.ClientDAO;
import br.com.maquinasbrito.factory.ConnectionFactory;
import br.com.maquinasbrito.model.ClientModel;

public class ClientController {
    ClientModel client =  new ClientModel();

    public ClientModel saveClient( String name,String lastName,  String cellPhone, String telephone) throws SQLException{
        client.setName(name);
        client.setLastname(lastName);
        client.setCellPhone(cellPhone); 
        client.setTelephone(telephone);  


        try(Connection connection = new ConnectionFactory().searchConnection()){
            ClientDAO clientDAO = new ClientDAO(connection);
            clientDAO.saveClientInBD(client);
        }
             
        
        return client;
    }


    public ClientModel searcherClientId(ClientModel dataInput) throws SQLException{
        client.setId(dataInput.getId());
        client.setName(dataInput.getName());

        String filter = "getId";


        try(Connection connection = new ConnectionFactory().searchConnection()){
            ClientDAO clientDAO = new ClientDAO(connection);
            clientDAO.searcherClientInBD(client, filter);
        }
        return client;
    }

    public List<ClientModel> searcherAllClient() throws SQLException{
        List<ClientModel> clientsList;
        try(Connection connection = new ConnectionFactory().searchConnection()){
            ClientDAO clientDAO = new ClientDAO(connection);
            clientsList = clientDAO.seacherAllClients();
        }
        return clientsList;
    }

    public ClientModel updaterClientId(int id, String name) throws SQLException{
        client.setId(id);
        client.setName(name);
            try(Connection connection= new ConnectionFactory().searchConnection()){
                ClientDAO clientDAO = new ClientDAO(connection);
                clientDAO.upadaterClient(client);
            }
        return client;
    }

    public ClientModel deleterClientId(ClientModel dataInput) throws SQLException{
        client.setId(dataInput.getId());

        try(Connection connection = new ConnectionFactory().searchConnection()){
            ClientDAO clientDAO = new ClientDAO(connection);
            clientDAO.deleterClient(dataInput);
        }
        return client;
    }

    public void deleterClient(ClientModel dataInput) throws SQLException{
        client.setId(dataInput.getId());

        try(Connection connection = new ConnectionFactory().searchConnection()){
            ClientDAO clientDAO = new ClientDAO(connection);
            clientDAO.deleterClient(client);
        }
    }

}
