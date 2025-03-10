package dev.odiador.ml.fxutils;

import java.io.IOException;

import dev.odiador.ml.MLApplication;
import dev.odiador.ml.ui.viewparts.ViewPart;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class FXMLPerspective {
    private ViewPart viewPart;
    private Parent presentation;

    public static FXMLPerspective loadPerspective(Presentation presentation) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                MLApplication.class
                        .getResource("/co/edu/uniquindio/estructuras/tienda/fxml/" + presentation.fxml + ".fxml"));
        Parent load = fxmlLoader.load();
        return new FXMLPerspective(fxmlLoader.getController(), load);
    }

    public enum Presentation {
        SIGN_IN("signin");

        private String fxml;

        Presentation(String fxml) {
            this.fxml = fxml;
        }
    }

}
