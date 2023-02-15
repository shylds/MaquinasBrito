package br.com.maquinasbrito.model;

import java.util.Date;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class ToolRentalModel {
    private int id;
    private DateTimeAtCompleted dateTimeWithdrawal; //data e hora da retirada da ferramenta
    private Date deliveryEstimate; //estimativa de entrega
    private DateTimeAtCompleted deliveredDateTimeOfTool; //data e horario de entrega da ferramenta

    public ToolRentalModel(){

    }
    
    public ToolRentalModel(int id, DateTimeAtCompleted dateTimeWithdrawal, Date deliveryEstimate,
            DateTimeAtCompleted deliveredDateTimeOfTool) {
        this.id = id;
        this.dateTimeWithdrawal = dateTimeWithdrawal;
        this.deliveryEstimate = deliveryEstimate;
        this.deliveredDateTimeOfTool = deliveredDateTimeOfTool;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DateTimeAtCompleted getDateTimeWithdrawal() {
        return dateTimeWithdrawal;
    }

    public void setDateTimeWithdrawal(DateTimeAtCompleted dateTimeWithdrawal) {
        this.dateTimeWithdrawal = dateTimeWithdrawal;
    }

    public Date getDeliveryEstimate() {
        return deliveryEstimate;
    }

    public void setDeliveryEstimate(Date deliveryEstimate) {
        this.deliveryEstimate = deliveryEstimate;
    }

    public DateTimeAtCompleted getDeliveredDateTimeOfTool() {
        return deliveredDateTimeOfTool;
    }

    public void setDeliveredDateTimeOfTool(DateTimeAtCompleted deliveredDateTimeOfTool) {
        this.deliveredDateTimeOfTool = deliveredDateTimeOfTool;
    }

    
}
