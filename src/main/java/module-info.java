module dev.odiador.inventarioml {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires net.synedra.validatorfx;
    requires eu.hansolo.tilesfx;
    requires static lombok;

    opens dev.odiador.inventarioml.viewparts to javafx.fxml;
    exports dev.odiador.inventarioml;
}