package dev.odiador.ml.ui.viewparts;

import java.net.URL;
import java.util.ResourceBundle;

import dev.odiador.ml.fxutils.FXMLPerspective.Presentation;
import dev.odiador.ml.ui.viewmodels.contenedorPrincipal.MainPaneViewModel;
import lombok.Getter;

public class MainPaneViewPart extends ViewPart {

    @Getter
    private static MainPaneViewPart instance;
    private MainPaneViewModel viewModel;

    public MainPaneViewPart() {
        MainPaneViewPart.instance = this;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        viewModel = new MainPaneViewModel(this);
    }

    public void changeCenter(Presentation presentation) {

    }

}
