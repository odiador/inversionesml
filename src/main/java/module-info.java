module dev.odiador.inventarioml {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires net.synedra.validatorfx;
    requires eu.hansolo.tilesfx;

    opens dev.odiador.inventarioml to javafx.fxml;
    exports dev.odiador.inventarioml;
}