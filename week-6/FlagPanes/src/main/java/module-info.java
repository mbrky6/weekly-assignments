module com.mycompany.flagpanes {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.flagpanes to javafx.fxml;
    exports com.mycompany.flagpanes;
}
