package controller;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import db.ReservationFormDatabase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Customer;
import view.Tm.CustomerTm;

import java.io.IOException;
import java.util.Optional;

public class ReservationFormController {
    public AnchorPane ReservationContext;
    public JFXTextField txtCustomerName;
    public JFXTextField txtNic;
    public JFXTextField txtTeleNumber;
    public JFXTextField txtEmail;
    public JFXTextField txtAddress;
    public JFXTextField txtRoom;
    public JFXTextField txtArrival;
    public JFXTextField txtDuration;
    public JFXTextField txtCost;
    public JFXTextField txtDeparture;
    public JFXTextField txtTokenNumber;
    public JFXTextArea txtSpecialNotes;
    public JFXCheckBox cbxSingle;
    public JFXCheckBox cbxDouble;
    public JFXCheckBox cbxTriple;
    public JFXCheckBox cbxQuad;
    public JFXCheckBox cbxLocal;
    public JFXCheckBox cbxChinese;
    public JFXCheckBox cbxFrench;
    public TextField txtEnterCustomerNicName;
    public JFXTextField txtEnterHere;
    public TableView<CustomerTm> tblCustomerD;
    public TableColumn colEmail;
    public TableColumn colName;
    public TableColumn colId;
    public TableColumn colRoom;
    public TableColumn colArrival;
    public TableColumn colDeparture;
    public TableColumn colOption;
    
    public void initialize(){
        colId.setCellValueFactory(new PropertyValueFactory("cToken"));
        colName.setCellValueFactory(new PropertyValueFactory("name"));
        colEmail.setCellValueFactory(new PropertyValueFactory("email"));
        colRoom.setCellValueFactory(new PropertyValueFactory("rooM_Number"));
        colOption.setCellValueFactory(new PropertyValueFactory("btn"));
        loadAllCustomers();
    }

    private void loadAllCustomers() {
        ObservableList<CustomerTm> obList= FXCollections.observableArrayList();
        for (Customer c: ReservationFormDatabase.customerTable
             ) {
            Button btn =new Button("Delete");
            CustomerTm t= new CustomerTm(c.getcToken(),c.getName(),c.getEmail(),c.getRooM_Number(),btn);
            obList.add(t);

            btn.setOnAction((e)->{
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                        "Do you really want to delete this customer?",
                        ButtonType.YES,ButtonType.NO);
                Optional<ButtonType>buttonType=alert.showAndWait();
                if(buttonType.get().equals(ButtonType.YES)) {

                    ReservationFormDatabase.customerTable.remove(c);
                    obList.remove(t);
                }
            });


            
        }
        tblCustomerD.setItems(obList);
    }

    public void HomeButtonOnAction(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage) ReservationContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HomeForm.fxml"))));
    }

    public void SubmitOnAction(ActionEvent actionEvent) {

        Customer c1 = new Customer(
                Integer.parseInt(txtTokenNumber.getText()),
                txtCustomerName.getText(),
                txtEmail.getText(),
                Integer.parseInt(txtRoom.getText())

        );
        ReservationFormDatabase.customerTable.add(c1);
        loadAllCustomers();
    }

    public void EmailOnAction(ActionEvent actionEvent) {
    }

    public void PrintOnAction(ActionEvent actionEvent) {
    }
}
