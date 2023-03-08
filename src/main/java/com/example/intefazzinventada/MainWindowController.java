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

    @FXML
    private TextField tfApellidos;

    @FXML
    private TextField tfTelefono;

    @FXML
    private Button btGuardar;

    @FXML
    protected void onGuardarButtonClick() throws Exception {

        try {

                // Cargo la vista
                FXMLLoader loader = new FXMLLoader(AppLauncher.class.getResource("NewWindow-view.fxml"));

                // Cargo la ventana
                Parent root = loader.load();

                // Creo el Scene
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setTitle("Estos son tus datos camarada");
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setScene(scene);
                stage.showAndWait();

            } catch (IOException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText(e.getMessage());
                System.out.println(e.getMessage().toString());
                alert.showAndWait();
            }

        }


}