package br.com.maquinasbrito.model;

public class ToolModel {
    private int id;
    private String brand;
    private String model;
    private String clas;
    private String subClass;

    public ToolModel(){

    }

    public ToolModel(int id){
        this.id = id;
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

    public String getClas(){
        return this.clas;
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

    public void setClas(String clas){
        this.clas = clas;
    }

    public void setSubClass(String subClass){
        this.subClass = subClass;
    }
}
