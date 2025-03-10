package dev.odiador.ml.ui.viewmodels;

import dev.odiador.ml.ui.UI;
import dev.odiador.ml.ui.viewparts.UIProvider;
import dev.odiador.ml.ui.viewparts.ViewPart;

public abstract class AbstractViewModel {

    private UIProvider uiProvider;

    public AbstractViewModel(ViewPart viewPart) {
        uiProvider = viewPart;
    }

    public UI getTheUI() {
        return uiProvider.getTheUI();
    }
}
