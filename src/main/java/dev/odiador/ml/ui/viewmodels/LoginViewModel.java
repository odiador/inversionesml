package dev.odiador.ml.ui.viewmodels;

import dev.odiador.ml.ui.fxutils.Presentation.ViewType;
import dev.odiador.ml.ui.view.ViewManagement;
import dev.odiador.ml.ui.view.ViewManagement.PosType;
import dev.odiador.ml.ui.view.views.LoginViewPart;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginViewModel extends AbstractViewModel<LoginViewPart> {

    private TextField tfMail;
    private PasswordField tfPassword;

    @Override
    public void updateData(LoginViewPart viewPart) {
        this.tfMail = viewPart.getTfMail();
        this.tfPassword = viewPart.getTfPassword();
    }

    public void onRegisterPressed() {
        System.out.println(tfMail.getText());
        System.out.println(tfPassword.getText());
    }

    public void onForgotPasswordPressed() {
        System.out.println(tfMail.getText());
        System.out.println(tfPassword.getText());
    }

    public void onSignInPressed() {
        ViewManagement.getInstance().setView(PosType.CENTER, ViewType.SIGN_IN);
    }

    public String getTfMailText() {
        return tfMail.getText();
    }

    public String getTfPasswordText() {
        return tfPassword.getText();
    }

}
