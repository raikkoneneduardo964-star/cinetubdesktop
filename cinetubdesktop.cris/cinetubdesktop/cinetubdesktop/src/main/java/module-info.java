module com.example.cinetubdesktop {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.cinetubdesktop to javafx.fxml;
    opens com.example.cinetubdesktop.controller to javafx.fxml;
    opens com.example.cinetubdesktop.model to javafx.base;

    exports com.example.cinetubdesktop;
    exports com.example.cinetubdesktop.controller;
}