package com.example.intefazzinventada;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindowController {
  
    @FXML
    private TextField tfNombre;

    public Usuario user;

    @FXML
    private TextField tfApellidos;

    @FXML
    private TextField tfTelefono;

    @FXML
    private Button btGuardar;

    @FXML
    protected void onGuardarButtonClick() throws Exception {


        guardar();

        try {

                // Cargo la vista
                FXMLLoader loader = new FXMLLoader(AppLauncher.class.getResource("NewWindow-view.fxml"));

                // Cargo la ventana
                Parent root = loader.load();

                // Creo el Scene
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setTitle("Estos son tus datos");
                stage.initModality(Modality.APPLICATION_MODAL);


                stage.setUserData(user);


                stage.setScene(scene);
                stage.showAndWait();






                //tfTelefono.setUserData(tfTelefono.getText());*/




            } catch (IOException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText(e.getMessage());
                System.out.println(e.getMessage().toString());
                alert.showAndWait();
            }

        }


    @FXML
    private void guardar() {

        String ape=tfApellidos.getText().trim();
        String tel=tfTelefono.getText().trim();
        String nombre=tfNombre.getText().trim();


        user =new Usuario(nombre,ape,tel);



    }




}
