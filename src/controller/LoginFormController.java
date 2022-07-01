package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public AnchorPane LoginContext;
    public JFXTextField txtUserName;
    public JFXPasswordField pwdPassword;
    int attemps = 0;

    public void BackOnAction(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage) LoginContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/BlueOceanHotelMainForm.fxml"))));
    }

    public void ForgetOnAction(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage) LoginContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ForgetPasswordForm.fxml"))));
    }

    public void CreateAccountOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) LoginContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/CreateAccountForm.fxml"))));
    }

    public void LoginOnAction(ActionEvent actionEvent) throws IOException {
        String tempUserName = txtUserName.getText();
        String tempPassword = pwdPassword.getText();
        attemps ++;
        if (attemps<=3) {

            if (tempUserName.equals("admin") && tempPassword.equals("0000")) {


                Stage stage = (Stage) LoginContext.getScene().getWindow();
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HomeForm.fxml"))));

            }
            else if (tempUserName.equals("receptionist") && tempPassword.equals("1234"))
            {

                Stage stage = (Stage) LoginContext.getScene().getWindow();
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HomeForm.fxml"))));

            }



            else {

                new Alert(Alert.AlertType.WARNING, "Wrong Password Try again").show();
            }
        }
        else {

            txtUserName.setEditable(false);
            pwdPassword.setEditable(false);
        }




    }
}