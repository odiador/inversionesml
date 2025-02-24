package dev.odiador.ml.viewparts;

import java.net.URL;
import java.util.ResourceBundle;

import dev.odiador.ml.viewmodel.LoginViewModel;
import javafx.animation.Interpolator;
import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import lombok.Getter;

public class LoginViewPart implements Initializable {

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

    private ScaleTransition signinTransition;

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
        signinTransition = new ScaleTransition(Duration.millis(100), btnSignIn);
        signinTransition.setFromX(1);
        signinTransition.setToX(1.1);
        signinTransition.setFromY(1);
        signinTransition.setToY(1.1);
        signinTransition.setInterpolator(Interpolator.EASE_BOTH);

        btnSignIn.setOnMouseEntered((e) -> {
            signinTransition.stop();
            signinTransition.setRate(1);
            signinTransition.jumpTo(Duration.ZERO);
            signinTransition.play();
        });
        btnSignIn.setOnMouseExited((e) -> {
            signinTransition.stop();
            signinTransition.setRate(-1);
            signinTransition.jumpTo(Duration.millis(100));
            signinTransition.play();
        });
    }

}
