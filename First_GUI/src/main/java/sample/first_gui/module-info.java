module sample.first_gui {
    requires javafx.controls;
    requires javafx.fxml;
    //requires java.persistence;

    opens sample.first_gui to javafx.fxml;

    exports sample.first_gui;
}