module com.internshala.connectfour {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.internshala.connect4 to javafx.fxml;
    exports com.internshala.connect4;
}