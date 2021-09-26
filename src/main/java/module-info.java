module com.example.test01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test01 to javafx.fxml;
    exports com.example.test01;
}