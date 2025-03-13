package dev.odiador.ml.ui.view.views;

import dev.odiador.ml.ui.viewmodels.contenedorPrincipal.MainPaneViewModel;
import dev.odiador.ml.ui.viewparts.ViewPart;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

public class MainPaneViewPart extends ViewPart<MainPaneViewModel> {

    @FXML
    private BorderPane mainLayer, secondLayer;

    public MainPaneViewPart() {
        super(new MainPaneViewModel());
    }

    @Override
    public void initialize() {
    }

    @Override
    public void updateData() {
        getViewModel().updateData(this);
    }

}
