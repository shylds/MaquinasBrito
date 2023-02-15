package br.com.maquinasbrito.controller;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.maquinasbrito.dao.ToolDAO;
import br.com.maquinasbrito.factory.ConnectionFactory;
import br.com.maquinasbrito.model.ToolModel;

public class ToolController {
    ToolModel tool = new ToolModel();

    public ToolModel saveTool(String brand, String model, String clas, String subClass) throws SQLException{
        tool.setBrand(brand);
        tool.setModel(model);
        tool.setClas(clas);
        tool.setSubClass(subClass);

        try(Connection connection = new ConnectionFactory().searchConnection()){
            ToolDAO toolDAO = new ToolDAO(connection);
            toolDAO.saveToolInBD(tool);
        }

        return tool;
    }

    public ToolModel seacherTools(ToolModel toolModel) throws SQLException{
        tool.setId(toolModel.getId());
        try(Connection connection = new ConnectionFactory().searchConnection()){
            ToolDAO toolDAO = new ToolDAO(connection);
            toolDAO.searcherToolInBD(tool);
        }
        return tool;
    }
}
