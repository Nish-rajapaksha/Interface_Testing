package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminRoomMealFormController {
    public AnchorPane AdminContext;

    public void ConfirmOnAction(ActionEvent actionEvent) {
    }

    public void HomeOnAction(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage) AdminContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HomeForm.fxml"))));

    }
}
