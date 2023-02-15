package br.com.maquinasbrito.view;

import java.sql.SQLException;

import br.com.maquinasbrito.controller.ToolController;
import br.com.maquinasbrito.model.ToolModel;

public class SaveTool {
    public static void main(String[] Args) throws SQLException{
        ToolController toolController = new ToolController();
        ToolModel returnTool = toolController.saveTool("Bosch", "11228", "Martelete", "Perfurador");
        
        System.out.println("Maquina: " + returnTool.getModel() + " id: "+ returnTool.getId() +" Cadastrada com sucesso!");
    }
}
