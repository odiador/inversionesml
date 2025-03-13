package dev.odiador.ml.ui.view.views;

import dev.odiador.ml.ui.view.ViewPart;
import dev.odiador.ml.ui.viewmodels.MainPaneViewModel;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import lombok.Getter;

public class MainPaneViewPart extends ViewPart<MainPaneViewModel> {

    @FXML
    @Getter
    BorderPane mainLayer, secondLayer;

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
