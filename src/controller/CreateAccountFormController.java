package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.security.auth.login.LoginContext;
import java.io.IOException;

public class CreateAccountFormController {
    public AnchorPane CreateContext;

    public void cBackOnAction(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage) CreateContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"))));
        stage.centerOnScreen();
    }

    public void CreateOnAction(ActionEvent actionEvent) throws IOException {

        setUI(("LoginForm"));


    }

    private void setUI(String location) throws IOException{

        Stage stage =(Stage) CreateContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));

    }

}
