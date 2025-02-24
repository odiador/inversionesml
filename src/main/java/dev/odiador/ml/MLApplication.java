package dev.odiador.ml;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MLApplication extends Application {
    private static Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        MLApplication.stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(MLApplication.class.getResource("/dev/odiador/ml/fxml/signin.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.getIcons().add(new Image(MLApplication.class.getResource("/dev/odiador/ml/images/notext.png").toString()));
        stage.setTitle("ML");
        stage.setScene(scene);
        stage.show();
    }

    public static void setTitle(String value) {
        stage.setTitle(value);
    }

    public static void main(String[] args) {
        launch();
    }
}