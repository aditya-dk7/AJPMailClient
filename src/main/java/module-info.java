module com.dk7aditya.ajpmailclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dk7aditya.ajpmailclient to javafx.fxml;
    exports com.dk7aditya.ajpmailclient;
}