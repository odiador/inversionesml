package dev.odiador.ml.ui.viewmodels;

import dev.odiador.ml.ui.view.ViewManagement;
import dev.odiador.ml.ui.view.views.MainPaneViewPart;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class MainPaneViewModel extends AbstractViewModel<MainPaneViewPart> {

    private BorderPane mainLayer, secondLayer;

    @Override
    public void updateData(MainPaneViewPart viewPart) {
        mainLayer = viewPart.getMainLayer();
        secondLayer = viewPart.getSecondLayer();
    }

    public void setElement(ViewManagement.PosType posType, Parent value) {
        switch (posType) {
            case BOTTOM:
                mainLayer.setBottom(value);
                break;
            case CENTER:
                mainLayer.setCenter(value);
                break;
            case LEFT:
                mainLayer.setLeft(value);
                break;
            case RIGHT:
                mainLayer.setRight(value);
                break;
            case TOP:
                mainLayer.setTop(value);
                break;
        }
    }

    public void setSecondLayerElement(ViewManagement.PosType posType, Parent value) {
        switch (posType) {
            case BOTTOM:
                secondLayer.setBottom(value);
                break;
            case CENTER:
                secondLayer.setCenter(value);
                break;
            case LEFT:
                secondLayer.setLeft(value);
                break;
            case RIGHT:
                secondLayer.setRight(value);
                break;
            case TOP:
                secondLayer.setTop(value);
                break;
        }
    }

}
