package br.com.maquinasbrito.view;

import java.sql.SQLException;

import br.com.maquinasbrito.controller.ToolController;
import br.com.maquinasbrito.model.ToolModel;

public class UpdaterTool {
    public static void main(String[] Args) throws SQLException{
        ToolController toolController = new ToolController();
        ToolModel returnTool = toolController.updaterTools(1, "Dewalt", "D28090", "Martelete", "Rompedor");

        System.out.println("A Ferramenta do identificador: " + returnTool.getId() + " foi modificada com Sucesso!");
        System.out.println("{"+ returnTool.getBrand() + " " + returnTool.getModel() +" }");
    }
}
