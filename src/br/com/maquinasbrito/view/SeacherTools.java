package br.com.maquinasbrito.view;

import java.sql.SQLException;

import br.com.maquinasbrito.controller.ToolController;
import br.com.maquinasbrito.model.ToolModel;

public class SeacherTools {
    public static void main(String[] Args) throws SQLException{
        ToolController toolController = new ToolController();
        ToolModel toolModel = new ToolModel(1);

        ToolModel returnTool = toolController.seacherTools(toolModel);
            System.out.println("Maquina de retorno é: " + returnTool.getModel() + " "+ returnTool.getBrand() + " " + returnTool.getToolClass() + " " + returnTool.getSubClass());
    }
}
