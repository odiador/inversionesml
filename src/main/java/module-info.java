module dev.odiador.ml {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires net.synedra.validatorfx;
    requires eu.hansolo.tilesfx;
    requires static lombok;

    opens dev.odiador.ml.viewparts to javafx.fxml;
    exports dev.odiador.ml;
}