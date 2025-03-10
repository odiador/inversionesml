package dev.odiador.ml.ui.model;

import dev.odiador.ml.domain.Domain;
import dev.odiador.ml.ui.UI;
import lombok.Getter;
import lombok.Setter;

public class ModelFactoryModel {
    @Getter
    @Setter
    protected Domain theDomain;
    @Getter
    @Setter
    protected UI theUI;

}
