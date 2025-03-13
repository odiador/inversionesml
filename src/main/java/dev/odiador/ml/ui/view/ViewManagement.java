package dev.odiador.ml.ui.view;

import dev.odiador.ml.MLApplication;
import dev.odiador.ml.ModelFactoryModel;
import dev.odiador.ml.ui.fxutils.Presentation;
import dev.odiador.ml.ui.fxutils.Presentation.ViewType;
import dev.odiador.ml.ui.view.views.MainPaneViewPart;
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
    private Presentation<MainPaneViewPart> mainPane;

    public void initialize(ViewType viewType, String title, String image) {
        initializeMainPane();
        setView(PosType.CENTER, viewType);
        setTitle(title);
        setImage(image);
    }

    public void setView(PosType posType, ViewType viewType) {
        Parent view = ModelFactoryModel.getInstance().loadView(viewType).getView();
        mainPane.getViewPart().getViewModel().setElement(posType, view);
    }

    @SuppressWarnings("unchecked")
    private void initializeMainPane() {
        mainPane = (Presentation<MainPaneViewPart>) ModelFactoryModel.getInstance()
                .loadView(ViewType.MAIN_PANE);
        stage.getScene().setRoot(mainPane.getView());
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
        if (stage.getScene() == null)
            stage.setScene(new Scene(new BorderPane(), 800, 600));
    }

    public enum PosType {
        TOP, CENTER, LEFT, RIGHT, BOTTOM;
    }
}
