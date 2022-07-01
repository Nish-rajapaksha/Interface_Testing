package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RoomAvailabilityFormController {
    public AnchorPane AvailabilityContext;

    public void HomeButtonOnAction(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage) AvailabilityContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HomeForm.fxml"))));
    }

    public void SaveOnAction(ActionEvent actionEvent) {
    }

    public void SearchOnAction(ActionEvent actionEvent) {
    }
}
