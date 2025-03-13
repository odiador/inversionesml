package dev.odiador.ml;

import java.io.IOException;
import java.util.Objects;

import dev.odiador.ml.domain.Domain;
import dev.odiador.ml.ui.UI;
import dev.odiador.ml.ui.fxutils.Presentation;
import dev.odiador.ml.ui.view.ViewPart;
import dev.odiador.ml.ui.view.views.*;
import dev.odiador.ml.ui.viewmodels.AbstractViewModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ModelFactoryModel {

    private ModelFactoryModel() {
        this.modelFactory = new ModelFactory();
    }

    private static class SingletonHolder {
        private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
    }

    public static ModelFactoryModel getInstance() {
        return SingletonHolder.eINSTANCE;
    }

    private ModelFactory modelFactory;
    private Presentation<LoginViewPart> loginViewPart;
    private Presentation<MainPaneViewPart> mainPaneViewPart;

    public Presentation<? extends ViewPart<? extends AbstractViewModel<?>>> loadView(Presentation.ViewType viewType) {
        try {
            if (Objects.isNull(viewType))
                throw new NullPointerException("El tipo de vista no puede ser null");
            return loadViewPrivate(viewType);
        } catch (IOException e) {
            System.err.println("No se pudo cargar la clase");
            System.err.println(e);
            return null;
        }
    }

    private Presentation<? extends ViewPart<? extends AbstractViewModel<?>>> loadViewPrivate(
            Presentation.ViewType viewType)
            throws IOException {
        Presentation<?> selected = null;
        switch (viewType) {
            case MAIN_PANE:
                if (mainPaneViewPart == null)
                    mainPaneViewPart = Presentation.loadPresentation(viewType);
                selected = mainPaneViewPart;
                break;
            case SIGN_IN:
                if (loginViewPart == null)
                    loginViewPart = Presentation.loadPresentation(viewType);
                selected = loginViewPart;
                break;
            default:
                break;

        }
        if (selected != null)
            selected.getViewPart().updateData();
        return selected;
    }

    public Domain getTheDomain() {
        return modelFactory.getTheDomain();
    }

    public UI getTheUI() {
        return modelFactory.getTheUI();
    }
}
