package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeFormController {
    public AnchorPane HomeContext;

    public void IncomeOnAction(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage) HomeContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/IncomeForm.fxml"))));


    }

    public void MealOnAction(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage) HomeContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminRoomMealForm.fxml"))));
    }

    public void aRoomOnAction(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage) HomeContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminRoomMealForm.fxml"))));
    }

    public void CustomerOnAction(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage) HomeContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReservationForm.fxml"))));


    }

    public void mRoomMainOnAction(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage) HomeContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/RoomAvailabilityForm.fxml"))));


    }

    public void ReserveOnAction(ActionEvent actionEvent) throws IOException {


        Stage stage = (Stage) HomeContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReserveRoomForm.fxml"))));


    }

    public void wOnAction(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage) HomeContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/WhoForm.fxml"))));
    }

    public void LogOutOnAction(ActionEvent actionEvent) throws IOException {


        Stage stage = (Stage) HomeContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/BluOceanHotelMainForm.fxml"))));

    }
}
