package dev.odiador.ml.ui.view;

import dev.odiador.ml.MLApplication;
import dev.odiador.ml.ui.fxutils.Presentation.ViewType;
import dev.odiador.ml.ui.view.model.ModelFactoryModel;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ViewManagement {

    @Getter
    private Stage stage;

    public void setInfo(ViewType viewType, String title, String image) {
        setView(viewType);
        setTitle(title);
        setImage(image);
    }

    public void setView(ViewType viewType) {
        Parent view = ModelFactoryModel.getInstance().loadView(viewType).getView();
        stage.getScene().setRoot(view);
    }

    private static class SingletonHolder {
        private final static ViewManagement eINSTANCE = new ViewManagement();
    }

    public static ViewManagement getInstance() {
        return SingletonHolder.eINSTANCE;
    }

    public void setTitle(String value) {
        stage.setTitle(value);
    }

    public void setImage(String value) {
        Image image = new Image(MLApplication.class.getResource("/dev/odiador/ml/images/" + value).toString());
        stage.getIcons().clear();
        stage.getIcons().add(image);
    }

    public void setStage(Stage stage) {
        this.stage = stage;
        if (stage.getScene() == null) {
            stage.setScene(new Scene(new BorderPane(), 800, 600));
        }
    }
}
