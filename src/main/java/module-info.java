module com.example.testing {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.testing to javafx.fxml;
    exports com.example.testing;
    exports com.example.testing.Controller;
    opens com.example.testing.Controller to javafx.fxml;
}