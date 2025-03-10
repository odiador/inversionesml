package dev.odiador.ml.ui.viewparts;

import java.net.URL;
import java.util.ResourceBundle;

import dev.odiador.ml.fxutils.TransitionsUtil;
import dev.odiador.ml.ui.viewmodels.contenedorlogin.LoginViewModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import lombok.Getter;

public class LoginViewPart extends ViewPart {

    @FXML
    @Getter
    private TextField tfMail;

    @FXML
    @Getter
    private PasswordField tfPassword;

    @FXML
    @Getter
    private Button btnSignIn;

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
        TransitionsUtil.configureHoverTransition(btnSignIn, Duration.millis(100));
    }

}
