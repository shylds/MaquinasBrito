package br.com.maquinasbrito.view;

import java.sql.SQLException;

import br.com.maquinasbrito.controller.ToolController;

public class DeleterTool{

    public static void main(String[] Args) throws SQLException{
        ToolController toolController = new ToolController();

        toolController.deleterTool(1);

    }

}