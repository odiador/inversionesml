package dev.odiador.ml.ui.fxutils;

import java.io.IOException;

import dev.odiador.ml.MLApplication;
import dev.odiador.ml.ui.viewmodels.AbstractViewModel;
import dev.odiador.ml.ui.viewparts.ViewPart;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import lombok.Getter;

@Getter
public class Presentation<T extends ViewPart<? extends AbstractViewModel<T>>> {
    private T viewPart;
    private Parent view;

    public Presentation(T viewPart, Parent view) {
        this.viewPart = viewPart;
        this.view = view;
    }

    public static <T extends ViewPart<V>, V extends AbstractViewModel<T>> Presentation<T> loadPresentation(
            ViewType presentation)
            throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                MLApplication.class
                        .getResource("/dev/odiador/ml/fxml/" + presentation.fxml + ".fxml"));
        Parent load = fxmlLoader.load();
        T viewPart = fxmlLoader.getController();
        return new Presentation<T>(viewPart, load);
    }

    public enum ViewType {
        SIGN_IN("signin"), MAIN_PANE("mainpane");

        private String fxml;

        ViewType(String fxml) {
            this.fxml = fxml;
        }
    }

}
