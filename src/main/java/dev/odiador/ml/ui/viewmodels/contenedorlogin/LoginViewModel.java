package dev.odiador.ml.ui.viewmodels.contenedorlogin;

import dev.odiador.ml.ui.fxutils.Presentation.ViewType;
import dev.odiador.ml.ui.view.ViewManagement;
import dev.odiador.ml.ui.view.views.LoginViewPart;
import dev.odiador.ml.ui.viewmodels.AbstractViewModel;
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
        ViewManagement.getInstance().setView(ViewType.MAIN_PANE);
    }

    public String getTfMailText() {
        return tfMail.getText();
    }

    public String getTfPasswordText() {
        return tfPassword.getText();
    }

}
