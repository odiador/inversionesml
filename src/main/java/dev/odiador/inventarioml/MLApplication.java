package dev.odiador.inventarioml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MLApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MLApplication.class.getResource("/dev/odiador/inventarioml/fxml/signin.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("ML - Inversiones médicas");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}