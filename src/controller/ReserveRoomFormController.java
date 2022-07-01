package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReserveRoomFormController {
    public AnchorPane ReserveContext;

    public void cRoomAvailabilityOnAction(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage) ReserveContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/RoomAvailabilityForm.fxml"))));


    }

    public void ReserveRoomOnAction(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage) ReserveContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReservationForm.fxml"))));


    }


    public void HomeButtonOnAction(ActionEvent actionEvent) throws IOException {



        Stage stage = (Stage) ReserveContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HomeForm.fxml"))));
    }
}
