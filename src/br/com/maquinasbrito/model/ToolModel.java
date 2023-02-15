package br.com.maquinasbrito.model;

public class ToolModel {
    private int id;
    private String brand;
    private String model;
    private String toolClass;
    private String subClass;

    public ToolModel(){

    }

    public ToolModel(int id){
        this.id = id;
    }

    public ToolModel(int id, String brand, String model, String toolClass, String subClass){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.toolClass = toolClass;
        this.subClass = subClass;
    }

    public Integer getId(){
        return this.id;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    public String getToolClass(){
        return this.toolClass;
    }

    public String getSubClass(){
        return this.subClass;
    }


    public void setId(int id){
        this.id = id;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setToolClass(String toolClass){
        this.toolClass = toolClass;
    }

    public void setSubClass(String subClass){
        this.subClass = subClass;
    }
}
