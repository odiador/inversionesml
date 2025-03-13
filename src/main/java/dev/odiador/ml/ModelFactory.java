package dev.odiador.ml;

import dev.odiador.ml.domain.Domain;
import dev.odiador.ml.ui.UI;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ModelFactory {

    private UI theUI;
    private Domain theDomain;

    public ModelFactory() {
        this.theUI = new UI();
        this.theDomain = new Domain();
        theDomain.setTheUI(theUI);
        theUI.setDomain(theDomain);
    }

}
