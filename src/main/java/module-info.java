module wine.giveme.poketyper {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires com.google.common;
    requires org.slf4j;
    opens wine.giveme.poketyper.frontend to javafx.fxml;
    opens wine.giveme.poketyper.backend;
}