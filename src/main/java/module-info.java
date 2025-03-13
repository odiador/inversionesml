module dev.odiador.ml {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires net.synedra.validatorfx;
    requires eu.hansolo.tilesfx;
    requires static lombok;
    requires javafx.graphics;

    opens dev.odiador.ml.ui.view.views to javafx.fxml;

    exports dev.odiador.ml;
    exports dev.odiador.ml.ui;
    exports dev.odiador.ml.ui.view.model;
    exports dev.odiador.ml.domain;
    exports dev.odiador.ml.ui.fxutils;
}