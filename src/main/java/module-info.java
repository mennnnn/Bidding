module com.example.biddingsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.biddingsystem to javafx.fxml;
    exports com.example.biddingsystem;
}