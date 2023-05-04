module com.example.taskmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.taskmanagementsystem to javafx.fxml;
    exports com.example.taskmanagementsystem;
}