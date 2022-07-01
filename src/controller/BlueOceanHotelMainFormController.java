package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class BlueOceanHotelMainFormController {
    public AnchorPane BlueOceanContext;

    public void ReceptionistOnAction(ActionEvent actionEvent) throws IOException {

        setUI("LoginForm");

    }

    public void AdminOnAction(ActionEvent actionEvent) throws IOException {

        setUI("LoginForm");
    }

    private void setUI(String location) throws IOException {
        Stage stage = (Stage) BlueOceanContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}
