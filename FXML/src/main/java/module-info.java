module com.fxml {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.fxml  to javafx.fxml;
    exports com.fxml ;
}
