package br.com.maquinasbrito.model;

public class ClientModel {
    private int id;
    private String name ;
    private String lastname;
    private String cellPhone;
    private String telephone;

    public ClientModel(){
        
    }

    public ClientModel(int id){
        this.id = id;
    }

    public ClientModel(int id, String name){
        this.id = id;
        this.name =  name;
    }

    public ClientModel( int id, String name,String lastname, String cellPhone, String telephone) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.cellPhone = cellPhone;
        this.telephone = telephone;
    }

    public Integer getId(){
        return this.id;  
    }

    public String getName(){
        return this.name;
    }

    public String getLastname(){
        return this.lastname;
    }

    public String getCellPhone(){
        return this.cellPhone;
    }

    public String getTelephone(){
        return this.telephone;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public void setCellPhone(String cellPhone){
        this.cellPhone = cellPhone;
    }

    public void setTelephone(String telephone){
        this.telephone = telephone;
    }

    @Override
    public String toString(){
        //return String.format("Lista de clientes: %d, %s, %s, %s, %s", 
        //this.id, this.name, this.lastname, this.cellPhone, this.telephone );

        return String.format("{%d, %s, %s, %s, %s}", 
        this.id, this.name, this.lastname, this.cellPhone, this.telephone );
    }
}
