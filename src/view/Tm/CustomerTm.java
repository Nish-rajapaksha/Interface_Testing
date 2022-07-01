package view.Tm;

import javafx.scene.control.Button;

public class CustomerTm {

    private int cToken;
    private String name;
    private String email;
    private int rooM_Number;
    private Button btn;

    public CustomerTm() {
    }

    public CustomerTm(int cToken, String name, String email, int rooM_Number, Button btn) {
        this.cToken = cToken;
        this.name = name;
        this.email = email;
        this.rooM_Number = rooM_Number;
        this.btn = btn;
    }

    public int getcToken() {
        return cToken;
    }

    public void setcToken(int cToken) {
        this.cToken = cToken;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRooM_Number() {
        return rooM_Number;
    }

    public void setRooM_Number(int rooM_Number) {
        this.rooM_Number = rooM_Number;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "CustomerTm{" +
                "cToken=" + cToken +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", rooM_Number=" + rooM_Number +
                ", btn=" + btn +
                '}';
    }
}
