package dev.odiador.inventarioml.viewparts;

import java.net.URL;
import java.util.ResourceBundle;

import dev.odiador.inventarioml.viewmodel.LoginViewModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import lombok.Getter;

public class LoginViewPart implements Initializable {

    @FXML
    @Getter
    private TextField tfMail;

    @FXML
    @Getter
    private PasswordField tfPassword;

    private static LoginViewPart instance;
    private static LoginViewModel viewModel;

    public LoginViewPart() {
        LoginViewPart.instance = this;
        viewModel = new LoginViewModel(this);
    }

    public static LoginViewPart getInstance() {
        return instance;
    }

    @FXML
    void onForgotPasswordPressed(ActionEvent event) {
        viewModel.onForgotPasswordPressed();
    }

    @FXML
    void onRegisterPressed(ActionEvent event) {
        viewModel.onRegisterPressed();
    }

    @FXML
    void onSignInPressed(ActionEvent event) {
        viewModel.onSignInPressed();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        viewModel = new LoginViewModel(this);
    }

}
