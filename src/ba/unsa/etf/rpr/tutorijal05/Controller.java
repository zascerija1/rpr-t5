package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Controller {

    public String getDisplej() {
        return displej.get();
    }

    public SimpleStringProperty displejProperty() {
        return displej;
    }

    public void setDisplej(String displej) {
        this.displej.set(displej);
    }
    public Controller(){
        displej=new SimpleStringProperty("");
    }

    private SimpleStringProperty displej;
    private SimpleStringProperty prvi_operand=new SimpleStringProperty("");
    private SimpleStringProperty operacija=new SimpleStringProperty("");




    public void btn55(ActionEvent actionEvent) {
        if(displej.get()=="0") displej.set("");
        displej.set(displej.get()+"5");

    }

    public void btn66(ActionEvent actionEvent) {
        if(displej.get()=="0") displej.set("");
        displej.set(displej.get()+"6");
    }

    public void btn99(ActionEvent actionEvent) {
if(displej.get()=="0") displej.set("");
        displej.set(displej.get()+"9");
    }


    public void btn77(ActionEvent actionEvent) {
        if(displej.get()=="0") displej.set("");
        displej.set(displej.get()+"7");

    }

    public void btn88(ActionEvent actionEvent) {
        if(displej.get()=="0") displej.set("");
        displej.set(displej.get()+"8");

    }

    public void btn44(ActionEvent actionEvent) {
        if(displej.get()=="0") displej.set("");
        displej.set(displej.get()+"4");

    }

    public void minus(ActionEvent actionEvent) {
        prvi_operand.set(displej.get());
        displej.set("");
        operacija.set("-");

    }

    public void jednako(ActionEvent actionEvent) {
        displej.set((Double.parseDouble(prvi_operand.get())-Double.parseDouble(displej.get()))+"");


    }

    public void btn00(ActionEvent actionEvent) {
        displej.set("0");
    }

    public void btnMnozenje(ActionEvent actionEvent) {
        prvi_operand.set(displej.get());
        displej.set("");
        operacija.set("*");
    }
}
