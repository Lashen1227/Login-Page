module com.example.loginpage_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.loginpage_javafx to javafx.fxml;
    exports com.example.loginpage_javafx;
}