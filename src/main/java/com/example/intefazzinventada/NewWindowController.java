package com.example.intefazzinventada;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class NewWindowController {
  @FXML
    public GridPane abc;

    @FXML
    private Button btMostrarDatos;

    private Usuario user;
    @FXML
    private Label lbNombre;
    @FXML
    private Label lbApellidos;
    @FXML
    private Label lbTelf;


    //en VentanaNuevaController. Método que recupera los datos introducidos en la ventana anterior.


    @FXML
    protected void onMostrarDatosClick(){

        Stage stage = (Stage) this.abc.getScene().getWindow();   //Me devuelve la ventana
        user = (Usuario) stage.getUserData();
        System.out.println(user.toString());

        lbNombre.setText(user.getNombre());
        lbApellidos.setText(user.getApellidos());
        lbTelf.setText(user.getTelf());



    }
}
