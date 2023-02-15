package br.com.maquinasbrito.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.maquinasbrito.model.ClientModel;

public class ClientDAO {
    
	private Connection connection; //= connectionFactory.recuperarConexao();

    public ClientDAO(Connection connection) {
        this.connection = connection;
    }
    

    public void saveClientInBD(ClientModel clientModel) throws SQLException{
        String sql = "INSERT INTO cliente(name, lastname, cell_phone, phone)  VALUES (?, ?, ?, ?)";

        try(PreparedStatement pstm = this.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            pstm.setString(1, clientModel.getName());
            pstm.setString(2, clientModel.getLastname());
            pstm.setString(3, clientModel.getCellPhone());
            pstm.setString(4, clientModel.getTelephone());

            pstm.execute();

            try(ResultSet rst = pstm.getGeneratedKeys()){
                while(rst.next()){
                    clientModel.setId(rst.getInt(1)); 
                }
                rst.close();
            }
            pstm.close();
        }
        this.connection.close();
    }

    public void searcherClientInBD(ClientModel clientModel, String filter) throws SQLException{
        String sql = "SELECT * FROM  cliente WHERE " +filter+" = ?";

        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1, String.valueOf(clientModel.getId()));
       //pstm.setString(1, clientModel.getName());
        
        pstm.execute();

        ResultSet rst = pstm.getResultSet();

        while(rst.next()){
            clientModel.setId(rst.getInt("id"));
            clientModel.setName(rst.getString("name"));
            clientModel.setLastname(rst.getString("lastname"));
            clientModel.setCellPhone(rst.getString("cell_phone"));
            clientModel.setTelephone(rst.getString("phone"));
            
        }
        rst.close();
        pstm.close();
        connection.close();

    }

    public List<ClientModel> seacherAllClients() throws SQLException{
        List<ClientModel> clientes = new ArrayList<ClientModel>();
        String sql = "SELECT * FROM cliente";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.execute();

        ResultSet rst = pstm.getResultSet();

        while(rst.next()){
            ClientModel clientModel = new ClientModel(rst.getInt(1), 
                rst.getString(2), rst.getString(3),
                rst.getString(4), rst.getString(5));
                clientes.add(clientModel);
        }
        return clientes;
    }

    public void upadaterClient(ClientModel clientModel) throws SQLException{
        String sql = "UPDATE cliente SET name = ? WHERE id = ? ";

        PreparedStatement pstm =  connection.prepareStatement(sql);

        pstm.setString(1, clientModel.getName());
        pstm.setString(2, String.valueOf(clientModel.getId()));

        pstm.execute();

        pstm.close();
        connection.close();
    }


    public void deleterClient (ClientModel clientModel) throws SQLException{
        String sql = "DELETE FROM cliente WHERE id = ?";

        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setInt(1, clientModel.getId());
        pstm.execute();

        pstm.close();
        connection.close();
    }
    
}
