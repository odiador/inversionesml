package dev.odiador.ml.ui.viewmodels;

import dev.odiador.ml.ModelFactoryModel;
import dev.odiador.ml.ui.UI;
import dev.odiador.ml.ui.view.ViewPart;
import lombok.Getter;

public abstract class AbstractViewModel<T extends ViewPart<? extends AbstractViewModel<T>>> {
    public ModelFactoryModel mfm = ModelFactoryModel.getInstance();

    @Getter
    private T viewPart;

    public UI getTheUI() {
        return ModelFactoryModel.getInstance().getTheUI();
    }

    public abstract void updateData(T viewPart);
}
