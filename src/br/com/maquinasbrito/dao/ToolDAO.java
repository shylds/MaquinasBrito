package br.com.maquinasbrito.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.maquinasbrito.model.ToolModel;

public class ToolDAO {
    private Connection connection;
    ToolModel toolModel = new ToolModel();

    public ToolDAO(Connection connection){
        this.connection = connection;
    }

    public void saveToolInBD(ToolModel toolModel) throws SQLException{
        String sql = "INSERT INTO tools (brand, model, class, subclass) VALUES (?, ?, ?, ?)";

        try(PreparedStatement pstm = this.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstm.setString(1, toolModel.getBrand());
            pstm.setString(2, toolModel.getModel());
            pstm.setString(3, toolModel.getClas());
            pstm.setString(4, toolModel.getSubClass());

            pstm.execute();

            try(ResultSet rst = pstm.getGeneratedKeys()){
                while(rst.next()){
                    toolModel.setId(rst.getInt(1));
                }
                rst.close();
            }
            pstm.close();
        }
        this.connection.close();
    }

    public void searcherToolInBD(ToolModel toolModel) throws SQLException{
        String sql = "SELECT * FROM tools WHERE id_tool = ?"; 

        try(PreparedStatement pstm = this.connection.prepareStatement(sql)){
            pstm.setString(1, String.valueOf(toolModel.getId()));

            pstm.execute();

            ResultSet rst = pstm.getResultSet();

            while(rst.next()){
                //toolModel.setId(rst.getInt(Integer.parseInt("id_tool")));
                toolModel.setModel(rst.getString("model"));
                toolModel.setBrand(rst.getString("brand"));
                toolModel.setClas(rst.getString("class"));
                toolModel.setSubClass(rst.getString("subclass"));

            }
            rst.close();
            pstm.close();
            this.connection.close();
        }
    }
}
