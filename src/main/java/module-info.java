module com.example.cinetubdesktop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cinetubdesktop to javafx.fxml;
    exports com.example.cinetubdesktop;
}