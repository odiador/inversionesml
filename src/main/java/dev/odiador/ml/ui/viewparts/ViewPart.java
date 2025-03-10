package dev.odiador.ml.ui.viewparts;

import dev.odiador.ml.ui.UI;
import javafx.fxml.Initializable;

public abstract class ViewPart implements UIProvider, Initializable {

    private UI ui;

    @Override
    public UI getTheUI() {
        return ui;
    }

    @Override
    public void setTheUI(UI ui) {
        this.ui = ui;
    }

}
