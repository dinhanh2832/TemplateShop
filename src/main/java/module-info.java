module com.example.templateshop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.templateshop to javafx.fxml;
    exports com.example.templateshop;
}