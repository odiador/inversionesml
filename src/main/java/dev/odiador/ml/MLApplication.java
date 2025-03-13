package dev.odiador.ml;

import java.io.IOException;

import dev.odiador.ml.ui.fxutils.Presentation.ViewType;
import dev.odiador.ml.ui.view.ViewManagement;
import javafx.application.Application;
import javafx.stage.Stage;

public class MLApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        ViewManagement.getInstance().setStage(stage);
        ViewManagement.getInstance().initialize(ViewType.SIGN_IN, "ML Inversiones Médicas", "notext.png");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}