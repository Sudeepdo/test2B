module com.example.sudeep {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    opens com.example.sudeep to javafx.fxml;
    exports com.example.sudeep;

}