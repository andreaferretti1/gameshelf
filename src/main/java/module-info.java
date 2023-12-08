module com.application.gameshelf {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.application.gameshelf to javafx.fxml;
    exports com.application.gameshelf;
}