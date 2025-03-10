package dev.odiador.ml.ui.viewparts;

import dev.odiador.ml.ui.UI;

public interface UIProvider {
    UI getTheUI();

    void setTheUI(UI ui);
}
