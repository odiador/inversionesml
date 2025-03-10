package dev.odiador.ml;

import java.io.IOException;

import dev.odiador.ml.fxutils.FXMLPerspective;
import dev.odiador.ml.fxutils.FXMLPerspective.Presentation;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MLApplication extends Application {
    private static Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        MLApplication.stage = stage;
        Parent presentation = FXMLPerspective.loadPerspective(Presentation.SIGN_IN).getPresentation();
        Scene scene = new Scene(presentation);
        stage.getIcons()
                .add(new Image(MLApplication.class.getResource("/dev/odiador/ml/images/notext.png").toString()));
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