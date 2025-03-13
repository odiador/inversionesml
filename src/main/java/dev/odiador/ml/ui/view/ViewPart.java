package dev.odiador.ml.ui.view;

import java.net.URL;
import java.util.ResourceBundle;

import dev.odiador.ml.ModelFactoryModel;
import dev.odiador.ml.ui.UI;
import dev.odiador.ml.ui.viewmodels.AbstractViewModel;
import javafx.fxml.Initializable;
import lombok.Getter;
import lombok.Setter;

public abstract class ViewPart<T extends AbstractViewModel<? extends ViewPart<T>>> implements Initializable {

    public ModelFactoryModel mfm = ModelFactoryModel.getInstance();
    @Setter
    @Getter
    private T viewModel;

    public ViewPart(T viewModel) {
        this.viewModel = viewModel;
    }

    public UI getTheUI() {
        return mfm.getTheUI();
    }

    public abstract void updateData();

    public abstract void initialize();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initialize();
    }

}
