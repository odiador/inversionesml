package dev.odiador.ml.ui.view.views;

import dev.odiador.ml.ui.fxutils.TransitionsUtil;
import dev.odiador.ml.ui.viewmodels.contenedorlogin.LoginViewModel;
import dev.odiador.ml.ui.viewparts.ViewPart;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import lombok.Getter;

public class LoginViewPart extends ViewPart<LoginViewModel> {

    public LoginViewPart() {
        super(new LoginViewModel());
    }

    @FXML
    @Getter
    private TextField tfMail;

    @FXML
    @Getter
    private PasswordField tfPassword;

    @FXML
    @Getter
    private Button btnSignIn;

    @FXML
    void onForgotPasswordPressed(ActionEvent event) {
        getViewModel().onForgotPasswordPressed();
    }

    @FXML
    void onRegisterPressed(ActionEvent event) {
        getViewModel().onRegisterPressed();
    }

    @FXML
    void onSignInPressed(ActionEvent event) {
        getViewModel().onSignInPressed();
    }

    @Override
    public void initialize() {
        TransitionsUtil.configureHoverTransition(btnSignIn, Duration.millis(100));
    }

    @Override
    public void updateData() {
        getViewModel().updateData(this);
    }

}
