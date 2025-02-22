package dev.odiador.inventarioml.viewmodel;

import dev.odiador.inventarioml.viewparts.LoginViewPart;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginViewModel {

    private TextField tfMail;
    private PasswordField tfPassword;

    public LoginViewModel(LoginViewPart loginViewPart) {
        this.tfMail = loginViewPart.getTfMail();
        this.tfPassword = loginViewPart.getTfPassword();
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
        System.out.println(tfMail.getText());
        System.out.println(tfPassword.getText());
    }

    public String getTfMailText() {
        return tfMail.getText();
    }

    public String getTfPasswordText() {
        return tfPassword.getText();
    }

}
