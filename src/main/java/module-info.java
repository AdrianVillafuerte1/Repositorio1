module com.uiejemplos.proyectopruebaagit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.uiejemplos.proyectopruebaagit to javafx.fxml;
    exports com.uiejemplos.proyectopruebaagit;
}